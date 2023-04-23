package ve.edu.unet;

import ve.edu.unet.nodosAST.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Generador {
	/* Ilustracion de la disposicion de la memoria en
	 * este ambiente de ejecucion para el lenguaje Tiny
	 *
	 * |t1	|<- mp (Maxima posicion de memoria de la TM
	 * |t1	|<- desplazamientoTmp (tope actual)
	 * |free|
	 * |free|
	 * |...	|
	 * |x	|
	 * |y	|<- gp
	 * 
	 * */

	/* desplazamientoTmp es una variable inicializada en 0
	 * y empleada como el desplazamiento de la siguiente localidad
	 * temporal disponible desde la parte superior o tope de la memoria
	 * (la que apunta el registro MP).
	 * 
	 * - Se decrementa (desplazamientoTmp--) despues de cada almacenamiento y
	 * 
	 * - Se incrementa (desplazamientoTmp++) despues de cada eliminacion/carga en 
	 *   otra variable de un valor de la pila.
	 * 
	 * Pudiendose ver como el apuntador hacia el tope de la pila temporal
	 * y las llamadas a la funcion emitirRM corresponden a una inserccion 
	 * y extraccion de esta pila
	 */
	private static int desplazamientoTmp = 0;
	private static TablaSimbolos tablaSimbolos = null;
	private static int currentBlock = 0;
	private static BufferedWriter bw = null;
	private static int cont = 0;
	private static ArrayList<Label> labels = new ArrayList<Label>();;
	public static void setTablaSimbolos(TablaSimbolos tabla){
		tablaSimbolos = tabla;
	}
	
	public static void generarCodigoObjeto(NodoBase raiz) throws IOException {
		System.out.println();
		System.out.println();
		generarPreludioEstandar();
		if (UtGenP.debug) UtGenP.comment("-> Inicio", bw);
		generar(raiz);
		if (UtGenP.debug) UtGenP.instruction("STP","Fin", bw);

		if (UtGenP.debug) UtGenP.comment("<- Fin de la ejecucion", bw);
		System.out.println();
		System.out.println();

	}
	
	//Funcion principal de generacion de codigo
	//prerequisito: Fijar la tabla de simbolos antes de generar el codigo objeto 
	private static void generar(NodoBase nodo){
	if(tablaSimbolos!=null){
		if (nodo instanceof  NodoIf){
			generarIf(nodo);
		}else if (nodo instanceof  NodoRepeat){
			generarRepeat(nodo);
		}else if (nodo instanceof  NodoAsignacion){
			generarAsignacion(nodo);
		}else if (nodo instanceof  NodoLeer){
			generarLeer(nodo);
		}else if (nodo instanceof  NodoEscribir){
			generarEscribir(nodo);
		}else if (nodo instanceof NodoValor){
			generarValor(nodo);
		}else if (nodo instanceof NodoIdentificador){
			generarIdentificador(nodo);
		}else if (nodo instanceof NodoArray){
			generarArray(nodo);
		}
		else if (nodo instanceof NodoOperacion){
			generarOperacion(nodo, false);
		}else{
			System.out.println("BUG: Tipo de nodo a generar desconocido");
		}
		/*Si el hijo de extrema izquierda tiene hermano a la derecha lo genero tambien*/
		if(nodo.TieneHermano())
			generar(nodo.getHermanoDerecha());
	}else
		System.out.println("���ERROR: por favor fije la tabla de simbolos a usar antes de generar codigo objeto!!!");
}

	private static void generarIf(NodoBase nodo){
    	NodoIf n = (NodoIf)nodo;
		String labelElse, labelFalse = null;

		/* Genero el codigo para la parte de prueba del IF */
		if(UtGenP.debug) UtGenP.comment("-> if", bw);

		generar(n.getPrueba());
		labelElse = jump();
		UtGenP.instruction("FJP", labelElse, "if: jmp - else", bw);

		/*Genero la parte THEN*/
		generar(n.getParteThen());

		/*Genero la parte ELSE*/
		if( n.getParteElse() != null) {
			labelFalse = jump();
			UtGenP.instruction("UJP", labelFalse, "label: ujp", bw);
    	}

		UtGenP.instruction("LAB", labelElse, "label: jmp", bw);
		Label l = new Label(UtGenP.lineNumber(), labelElse);
		labels.add(l);

		if( labelFalse != null ){
			generar(n.getParteElse());
			UtGenP.instruction("LAB", labelFalse, "label: ujp", bw);
			Label l1 = new Label(UtGenP.lineNumber(), labelFalse);
			labels.add(l1);
		}

		if(UtGenP.debug) UtGenP.comment("<- if", bw);
	}
	
	private static void generarRepeat(NodoBase nodo){
    	NodoRepeat n = (NodoRepeat)nodo;
		String labelRepeat;

		if(UtGenP.debug) UtGenP.comment("-> repeat", bw);
		labelRepeat = jump();
		UtGenP.instruction("LAB", labelRepeat, "label: repeat", bw);
		Label l1 = new Label(UtGenP.lineNumber(),labelRepeat);
		labels.add(l1);

		/* Genero el cuerpo del repeat */
		generar(n.getCuerpo());
		/* Genero el codigo de la prueba del repeat */
		generar(n.getPrueba());
		UtGenP.instruction("FJP", labelRepeat, "repeat: jmp hacia el inicio del cuerpo", bw);

		if(UtGenP.debug) UtGenP.comment("<- repeat", bw);
	}		
	
	private static void generarAsignacion(NodoBase nodo){
		NodoAsignacion n = (NodoAsignacion)nodo;
		int direccion;

		if ( n.getVariable() instanceof NodoIdentificador) {
			NodoIdentificador nIdentificador = (NodoIdentificador)n.getVariable();
			direccion = tablaSimbolos.getDireccion(nIdentificador.getNombre(), currentBlock);
			UtGenP.instruction("LDA", direccion , "cargar direccion de identificador: "+n.getIdentificador(), bw);
			generar(n.getExpresion());
			UtGenP.instruction("STO", "asignacion: almaceno el valor para el id "+n.getIdentificador(), bw);
		}
	}
	
	private static void generarLeer(NodoBase nodo){
		NodoLeer n = (NodoLeer)nodo;
		int direccion;

		if(UtGenP.debug) UtGenP.comment("-> leer", bw);

		direccion = tablaSimbolos.getDireccion(n.getIdentificador(), currentBlock);
		UtGenP.instruction("LDA", direccion, "leer: cargar direccion de identificador "+n.getIdentificador(),bw);
		UtGenP.instruction("RDI", direccion, "leer: valor para el identificador "+n.getIdentificador(),bw);

		if(UtGenP.debug) UtGenP.comment("<- leer",bw);
	}
	
	private static void generarEscribir(NodoBase nodo){
		NodoEscribir n = (NodoEscribir)nodo;

		/* Genero el codigo de la expresion que va a ser escrita en pantalla */
		if(UtGenP.debug) UtGenP.comment("-> escribir", bw);
		generar(n.getExpresion());
		/* Ahora genero la salida */
		UtGenP.instruction("WRI", "escribir: valor de tope", bw);
		if(UtGenP.debug) UtGenP.comment("<- escribir", bw);
	}
	
	private static void generarValor(NodoBase nodo){
    	NodoValor n = (NodoValor)nodo;
    	if(UtGenP.debug) UtGenP.comment("-> constante", bw);
    	UtGenP.instruction("LDC", n.getValor(), "constante: cargar constante: "+n.getValor(), bw);
	}
	
	private static void generarIdentificador(NodoBase nodo){
		NodoIdentificador n = (NodoIdentificador)nodo;
		int direccion;
		direccion = tablaSimbolos.getDireccion(n.getNombre(), currentBlock);
		UtGenP.instruction("LOD", direccion, "id: carga valor de identificador: "+n.getNombre(), bw);
	}

	private static void generarArray(NodoBase nodo){
		NodoArray n = (NodoArray) nodo;
		NodoIdentificador ni = (NodoIdentificador) n.getIdentificador();
		int direccion = tablaSimbolos.getDireccion(ni.getNombre(),currentBlock);
		UtGenP.instruction("LDA",direccion, "vector: carga direccion de la variable: "+ni.getNombre(), bw);

		if (n.getExpresion() instanceof NodoOperacion){
			generarOperacion(n.getExpresion(), true);
		}else{
			generar(n.getExpresion());
		}

		UtGenP.instruction("IXA", "1", "carga: direccion de la posicion del vector: "+ni.getNombre(), bw);
		UtGenP.instruction("IND", 0,"carga: valor de la direccion anterior", bw);
	}

	private static void generarOperacion(NodoBase nodo, boolean array){
		NodoOperacion n = (NodoOperacion) nodo;

		if (n.getOperacion() == tipoOp.menor && array == false){
			generar(n.getOpDerecho());
			generar(n.getOpIzquierdo());
			UtGenP.instruction("GRT", "A mayor que B: B<A", bw);
			return;
		}

		if ((n.getOperacion() == tipoOp.menor || n.getOperacion() == tipoOp.igual) && array == true){
			if(UtGenP.debug) UtGenP.comment("error: vector con argumento < o =", bw);
		}

		generar(n.getOpIzquierdo());
		generar(n.getOpDerecho());

		switch(n.getOperacion()){
			case	mas:	UtGenP.instruction("ADI", "op: +", bw);
							break;
			case	menos:	UtGenP.instruction("SBI", "op: -", bw);
							break;
			case	por:	UtGenP.instruction("MPI", "op: *", bw);
							break;
			case	entre:	UtGenP.instruction("DVI", "op: /", bw);
							break;		
			//case	menor:	UtGenP.instruction("SBI", "op: <", bw);
			//				UtGenP.instruction("FJP", "voy dos instrucciones mas alla if verdadero (AC<0)", bw);
			//				UtGenP.instruction("LDC", "caso de falso (AC=0)", bw);
			//				UtGenP.instruction("LDA", "Salto incodicional a direccion: PC+1 (es falso evito colocarlo verdadero)", bw);
			//				UtGenP.instruction("LDC", "caso de verdadero (AC=1)", bw);
			//				break;
			case	igual:	UtGenP.instruction("EQU", "op: ==", bw);
			//				UtGenP.instruction("FJP", "voy dos instrucciones mas alla if verdadero (AC==0)", bw);
			//				UtGenP.instruction("LDC", "caso de falso (AC=0)", bw);
			//				UtGenP.instruction("LDA", "Salto incodicional a direccion: PC+1 (es falso evito colocarlo verdadero)", bw);
			//				UtGenP.instruction("LDC", "caso de verdadero (AC=1)", bw);
			//				break;

			case 	mayor:  /* mandar a emitir*/
							break;
			case 	mayor_igual: /* mandar a emitir*/
							break;
			case 	menor_igual: /* mandar a emitir*/
							break;
			case 	diferente: /* mandar a emitir*/
							break;
			case 	and: /* mandar a emitir*/
							break;
			case 	or:  /* mandar a emitir*/
							break;
			default:
							UtGen.emitirComentario("BUG: tipo de operacion desconocida");
		}
		if(UtGen.debug)	UtGen.emitirComentario("<- Operacion: " + n.getOperacion());
	}

	public static String jump() {
		cont++;
		return ""+cont;
	}

	private static void generarPreludioEstandar(){
		System.out.println("Compilacion TINY - Codigo P");
		System.out.println("Archivo: "+ "factorial");
		System.out.println();
		System.out.println();
	}
}
