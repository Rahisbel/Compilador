
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package ve.edu.unet;

import java_cup.runtime.*;
import ve.edu.unet.nodosAST.*;
import java.io.InputStreamReader;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\005\007\000\002\005\011\000\002" +
    "\006\006\000\002\016\002\000\002\007\006\000\002\010" +
    "\004\000\002\011\004\000\002\012\005\000\002\012\005" +
    "\000\002\012\003\000\002\013\005\000\002\013\005\000" +
    "\002\013\003\000\002\014\005\000\002\014\005\000\002" +
    "\014\003\000\002\015\005\000\002\015\003\000\002\015" +
    "\003\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\016\003\017\004\015\010\005\012\004\013" +
    "\020\014\016\001\002\000\004\014\070\001\002\000\016" +
    "\003\017\004\015\010\005\012\004\013\020\014\016\001" +
    "\002\000\014\002\ufffc\006\ufffc\007\ufffc\011\ufffc\027\ufffc" +
    "\001\002\000\014\002\ufffd\006\ufffd\007\ufffd\011\ufffd\027" +
    "\ufffd\001\002\000\014\002\ufff9\006\ufff9\007\ufff9\011\ufff9" +
    "\027\ufff9\001\002\000\014\002\ufffe\006\ufffe\007\ufffe\011" +
    "\ufffe\027\ufffe\001\002\000\014\002\ufffb\006\ufffb\007\ufffb" +
    "\011\ufffb\027\ufffb\001\002\000\004\002\064\001\002\000" +
    "\014\002\ufffa\006\ufffa\007\ufffa\011\ufffa\027\ufffa\001\002" +
    "\000\012\003\026\014\025\015\024\025\032\001\002\000" +
    "\004\016\ufff4\001\002\000\014\002\ufff8\006\ufff8\007\ufff8" +
    "\011\ufff8\027\ufff8\001\002\000\012\003\026\014\025\015" +
    "\024\025\032\001\002\000\006\002\001\027\022\001\002" +
    "\000\016\003\017\004\015\010\005\012\004\013\020\014" +
    "\016\001\002\000\014\002\uffff\006\uffff\007\uffff\011\uffff" +
    "\027\uffff\001\002\000\034\002\uffe6\005\uffe6\006\uffe6\007" +
    "\uffe6\011\uffe6\017\uffe6\020\uffe6\021\uffe6\022\uffe6\023\uffe6" +
    "\024\uffe6\026\uffe6\027\uffe6\001\002\000\034\002\uffe5\005" +
    "\uffe5\006\uffe5\007\uffe5\011\uffe5\017\uffe5\020\uffe5\021\uffe5" +
    "\022\uffe5\023\uffe5\024\uffe5\026\uffe5\027\uffe5\001\002\000" +
    "\034\002\uffe4\005\uffe4\006\uffe4\007\uffe4\011\uffe4\017\uffe4" +
    "\020\uffe4\021\uffe4\022\uffe4\023\uffe4\024\uffe4\026\uffe4\027" +
    "\uffe4\001\002\000\034\002\uffeb\005\uffeb\006\uffeb\007\uffeb" +
    "\011\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb\023\044\024" +
    "\043\026\uffeb\027\uffeb\001\002\000\034\002\uffe8\005\uffe8" +
    "\006\uffe8\007\uffe8\011\uffe8\017\uffe8\020\uffe8\021\uffe8\022" +
    "\uffe8\023\uffe8\024\uffe8\026\uffe8\027\uffe8\001\002\000\030" +
    "\002\uffee\005\uffee\006\uffee\007\uffee\011\uffee\017\037\020" +
    "\036\021\040\022\041\026\uffee\027\uffee\001\002\000\012" +
    "\003\026\014\025\015\024\025\032\001\002\000\014\002" +
    "\ufff1\006\ufff1\007\ufff1\011\ufff1\027\ufff1\001\002\000\004" +
    "\026\035\001\002\000\034\002\uffe7\005\uffe7\006\uffe7\007" +
    "\uffe7\011\uffe7\017\uffe7\020\uffe7\021\uffe7\022\uffe7\023\uffe7" +
    "\024\uffe7\026\uffe7\027\uffe7\001\002\000\012\003\026\014" +
    "\025\015\024\025\032\001\002\000\012\003\026\014\025" +
    "\015\024\025\032\001\002\000\012\003\026\014\025\015" +
    "\024\025\032\001\002\000\012\003\026\014\025\015\024" +
    "\025\032\001\002\000\034\002\uffec\005\uffec\006\uffec\007" +
    "\uffec\011\uffec\017\uffec\020\uffec\021\uffec\022\uffec\023\044" +
    "\024\043\026\uffec\027\uffec\001\002\000\012\003\026\014" +
    "\025\015\024\025\032\001\002\000\012\003\026\014\025" +
    "\015\024\025\032\001\002\000\034\002\uffea\005\uffea\006" +
    "\uffea\007\uffea\011\uffea\017\uffea\020\uffea\021\uffea\022\uffea" +
    "\023\uffea\024\uffea\026\uffea\027\uffea\001\002\000\034\002" +
    "\uffe9\005\uffe9\006\uffe9\007\uffe9\011\uffe9\017\uffe9\020\uffe9" +
    "\021\uffe9\022\uffe9\023\uffe9\024\uffe9\026\uffe9\027\uffe9\001" +
    "\002\000\034\002\uffed\005\uffed\006\uffed\007\uffed\011\uffed" +
    "\017\uffed\020\uffed\021\uffed\022\uffed\023\044\024\043\026" +
    "\uffed\027\uffed\001\002\000\024\002\uffef\005\uffef\006\uffef" +
    "\007\uffef\011\uffef\021\040\022\041\026\uffef\027\uffef\001" +
    "\002\000\024\002\ufff0\005\ufff0\006\ufff0\007\ufff0\011\ufff0" +
    "\021\040\022\041\026\ufff0\027\ufff0\001\002\000\004\016" +
    "\053\001\002\000\012\003\026\014\025\015\024\025\032" +
    "\001\002\000\014\002\ufff3\006\ufff3\007\ufff3\011\ufff3\027" +
    "\ufff3\001\002\000\004\005\056\001\002\000\016\003\017" +
    "\004\015\010\005\012\004\013\020\014\016\001\002\000" +
    "\010\006\060\007\061\027\022\001\002\000\016\003\017" +
    "\004\015\010\005\012\004\013\020\014\016\001\002\000" +
    "\014\002\ufff7\006\ufff7\007\ufff7\011\ufff7\027\ufff7\001\002" +
    "\000\006\007\063\027\022\001\002\000\014\002\ufff6\006" +
    "\ufff6\007\ufff6\011\ufff6\027\ufff6\001\002\000\004\002\000" +
    "\001\002\000\006\011\066\027\022\001\002\000\012\003" +
    "\026\014\025\015\024\025\032\001\002\000\014\002\ufff5" +
    "\006\ufff5\007\ufff5\011\ufff5\027\ufff5\001\002\000\014\002" +
    "\ufff2\006\ufff2\007\ufff2\011\ufff2\027\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\022\002\012\003\020\004\010\005\006\006" +
    "\005\007\011\010\013\011\007\001\001\000\002\001\001" +
    "\000\020\003\064\004\010\005\006\006\005\007\011\010" +
    "\013\011\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\012\054\013\030" +
    "\014\026\015\027\001\001\000\004\016\051\001\001\000" +
    "\002\001\001\000\012\012\032\013\030\014\026\015\027" +
    "\001\001\000\002\001\001\000\016\004\022\005\006\006" +
    "\005\007\011\010\013\011\007\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\012\033\013\030\014\026\015\027\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\013\050" +
    "\014\026\015\027\001\001\000\010\013\047\014\026\015" +
    "\027\001\001\000\006\014\046\015\027\001\001\000\006" +
    "\014\041\015\027\001\001\000\002\001\001\000\004\015" +
    "\045\001\001\000\004\015\044\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\012\053\013\030" +
    "\014\026\015\027\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\003\056\004\010\005\006\006\005\007\011" +
    "\010\013\011\007\001\001\000\002\001\001\000\020\003" +
    "\061\004\010\005\006\006\005\007\011\010\013\011\007" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\012\066" +
    "\013\030\014\026\015\027\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




/***********
SymbolFactory es una nueva caracteristica que ha sido a�adida a las version 11a de cup, la cual facilita la implementacion de clases Symbol personalizadas
, esto debido a que dicha clase no provee mucha informaci�n de contexto que podria ser util para el analisis semantico o ayudar en la construccion del AST
Mas informacion en: http//4thmouse.com/index.php/2007/02/15/using-custom-symbols-in-cup/
***********/
	public static void main(String args[]) throws Exception {
		SymbolFactory sf = new DefaultSymbolFactory();
		parser parser_obj;
		if (args.length==0) 
			parser_obj=new parser(new Lexico(new InputStreamReader(System.in),sf),sf);
		else
			parser_obj=new parser(new Lexico(new InputStreamReader(new java.io.FileInputStream(args[0])),sf),sf);

		parser_obj.parse();
		NodoBase root=parser_obj.action_obj.getASTroot();
		System.out.println();
		System.out.println("IMPRESION DEL AST GENERADO");
		System.out.println();
        Util.imprimirAST(root);
		TablaSimbolos ts = new TablaSimbolos();
		ts.cargarTabla(root);
		ts.ImprimirClaves();
		Generador.setTablaSimbolos(ts);
		Generador.generarCodigoObjeto(root);
	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


	private boolean debug=true;
	private NodoBase ast=null;
	private int lineanum=0;
	
	//Debe ser llamada solo despues de un parse(), en caso contrario retornara null siempre;
	public NodoBase getASTroot(){
		return ast;
	}
	

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= stmt_seq 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase s = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 1"); 
					ast = s;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt_seq ::= stmt_seq SEMI stmt 
            {
              NodoBase RESULT =null;
		int inileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iniright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase ini = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sentleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sentright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase sent = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 2a"); 
						NodoBase hijoActual = ini;
						if(hijoActual !=null){
							while(hijoActual.TieneHermano()){
								hijoActual = hijoActual.getHermanoDerecha();
							}
							hijoActual.setHermanoDerecha(sent);
							RESULT=ini;
						}else{
							RESULT=sent;
						}
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_seq",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt_seq ::= stmt 
            {
              NodoBase RESULT =null;
		int sentleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sentright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase sent = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 2b"); 
				RESULT=sent;				
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_seq",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= if_stmt 
            {
              NodoBase RESULT =null;
		int sifleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sifright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase sif = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 3a"); 
					RESULT=sif;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= repeat_stmt 
            {
              NodoBase RESULT =null;
		int srepleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int srepright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase srep = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 3b"); 
						RESULT=srep;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= assign_stmt 
            {
              NodoBase RESULT =null;
		int sasileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sasiright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase sasi = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 3c"); 
						RESULT=sasi;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= read_stmt 
            {
              NodoBase RESULT =null;
		int slecleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int slecright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase slec = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 3d"); 
					RESULT=slec;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= write_stmt 
            {
              NodoBase RESULT =null;
		int sescleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sescright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase sesc = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 3e"); 
					RESULT=sesc;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= error 
            {
              NodoBase RESULT =null;
		 if(debug) System.out.println("\t regla 3f"); 
				System.out.println("Ocurrio error en cup # 0004");
				RESULT=null;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // if_stmt ::= IF exp THEN stmt_seq END 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int pthenleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pthenright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoBase pthen = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if(debug) System.out.println("\t regla 4a"); 
		RESULT = new NodoIf(ex,pthen);
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // if_stmt ::= IF exp THEN stmt_seq ELSE stmt_seq END 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int pthenleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int pthenright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoBase pthen = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int pelseleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pelseright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoBase pelse = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if(debug) System.out.println("\t regla 4b"); 
		RESULT = new NodoIf(ex,pthen,pelse);		
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("if_stmt",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // repeat_stmt ::= REPEAT stmt_seq UNTIL exp 
            {
              NodoBase RESULT =null;
		int cuerpoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int cuerporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase cuerpo = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pruebaleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pruebaright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase prueba = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 5"); 
							RESULT = new NodoRepeat(cuerpo,prueba);
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("repeat_stmt",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$0 ::= 
            {
              NodoBase RESULT =null;
		int variableleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int variableright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String variable = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 if(debug) System.out.println("\t regla 6 parte del medio"); 
				/*lineanum=1000; //Pasar/Obtener la linea correcta por el Simbolo
				String nombre = variable.getName();*/
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // assign_stmt ::= ID NT$0 ASSIGN exp 
            {
              NodoBase RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoBase) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int variableleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int variableright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String variable = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 6 parte final");
					if(variable!=null)
					RESULT = new NodoAsignacion(variable.toString(),ex);
					else{
					RESULT = null;
					System.out.println("Ocurrio error en cup # 0001");
					}
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assign_stmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // read_stmt ::= READ ID 
            {
              NodoBase RESULT =null;
		int variableleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int variableright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String variable = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 7"); 
					System.out.println("Leyendo Variable");
					if(variable!=null)
					RESULT = new NodoLeer(variable.toString());
					else{
					RESULT = null;
					System.out.println("Ocurrio error en cup # 0002");
					}
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("read_stmt",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // write_stmt ::= WRITE exp 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 8"); 
					RESULT= new NodoEscribir(ex);
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("write_stmt",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // exp ::= simple_exp LT simple_exp 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 9a"); 
								RESULT = new NodoOperacion(exI,tipoOp.menor,exD);
								
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // exp ::= simple_exp EQ simple_exp 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 9b"); 
							RESULT = new NodoOperacion(exI,tipoOp.igual,exD);
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // exp ::= simple_exp 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 9c"); 
					RESULT = ex;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // simple_exp ::= simple_exp PLUS term 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 10a"); 
							RESULT = new NodoOperacion(exI,tipoOp.mas,exD);
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // simple_exp ::= simple_exp MINUS term 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 10b"); 
							RESULT = new NodoOperacion(exI,tipoOp.menos,exD);
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // simple_exp ::= term 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 10c"); 
				RESULT=ex;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("simple_exp",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // term ::= term TIMES factor 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 11a"); 
							RESULT = new NodoOperacion(exI,tipoOp.por,exD);
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // term ::= term OVER factor 
            {
              NodoBase RESULT =null;
		int exIleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exIright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoBase exI = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exDleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exDright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase exD = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 11b"); 
						RESULT = new NodoOperacion(exI,tipoOp.entre,exD);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // term ::= factor 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 11c"); 
					RESULT=ex;
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // factor ::= LPAREN exp RPAREN 
            {
              NodoBase RESULT =null;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoBase ex = (NodoBase)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if(debug) System.out.println("\t regla 12a"); 
							RESULT = ex;
							
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // factor ::= NUM 
            {
              NodoBase RESULT =null;
		int valorleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String valor = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 12b"); 
					System.out.println("Devolvi nodo numero entero");
					if(valor!=null){
						RESULT= new NodoValor(Integer.parseInt(valor));
					}else{
						RESULT = null;
						System.out.println("Ocurrio error en cup # 0005");
					}
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // factor ::= ID 
            {
              NodoBase RESULT =null;
		int variableleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int variableright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String variable = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 if(debug) System.out.println("\t regla 12c"); 
					if(variable!=null){
						System.out.println("Construyendo Nodo ID para Lexema: "+ variable.toString());
						RESULT= new NodoIdentificador(variable.toString());		
					}else{
						RESULT = null;
						System.out.println("Ocurrio error en cup # 0005");
					}
					
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // factor ::= error 
            {
              NodoBase RESULT =null;
		 if(debug) System.out.println("\t regla 12d"); 
				System.out.println("Ocurrio error en cup # 0003");
				RESULT=null;
				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
