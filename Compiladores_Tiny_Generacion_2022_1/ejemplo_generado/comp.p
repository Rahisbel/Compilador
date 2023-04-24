;        -> Inicio
LDA 0
        ;cargar direccion de identificador: x
;        -> constante
LDC 10
        ;constante: cargar constante: 10
STO
        ;asignacion: valor - id x
;        -> if
LOD 0
        ;id: carga valor de identificador: x
;        -> constante
LDC 10
        ;constante: cargar constante: 10
GREATER_EQUAL
        ;op: >=
;        <- Operacion: mayor_igual
FJP L1
        ;if false: JMP - else
;        -> escribir
LOD 0
        ;id: carga valor de identificador: x
WRI
        ;escribir: valor de tope
;        <- escribir
LAB L1
        ;label: jmp
;        <- if
STP
        ;Fin
;        <- Fin de la ejecucion