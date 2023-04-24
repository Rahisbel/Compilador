;        -> Inicio
;        -> leer
LDA 0
        ;leer: cargar direccion de identificador x
RDI 0
        ;leer: valor para el identificador x
;        <- leer
;        -> if
LOD 0
        ;id: carga valor de identificador: x
;        -> constante
LDC 0
        ;constante: cargar constante: 0
GRT
        ;A mayor que B: B<A
FJP L1
        ;if false: JMP - else
LDA 1
        ;cargar direccion de identificador: fact
;        -> constante
LDC 1
        ;constante: cargar constante: 1
STO
        ;asignacion: valor - id fact
;        -> repeat
LAB L2
        ;label: repeat
LDA 1
        ;cargar direccion de identificador: fact
LOD 1
        ;id: carga valor de identificador: fact
LOD 0
        ;id: carga valor de identificador: x
MPI
        ;op: *
;        <- Operacion: por
STO
        ;asignacion: valor - id fact
LDA 0
        ;cargar direccion de identificador: x
LOD 0
        ;id: carga valor de identificador: x
;        -> constante
LDC 1
        ;constante: cargar constante: 1
SBI
        ;op: -
;        <- Operacion: menos
STO
        ;asignacion: valor - id x
LOD 0
        ;id: carga valor de identificador: x
;        -> constante
LDC 0
        ;constante: cargar constante: 0
EQU
        ;op: ==
;        <- Operacion: igual
FJP L2
        ;repeat: JMP - inicio del cuerpo
;        <- repeat
;        -> escribir
LOD 1
        ;id: carga valor de identificador: fact
WRI
        ;escribir: valor de tope
;        <- escribir
LAB L1
        ;label: jmp
;        <- if
STP
        ;Fin
;        <- Fin de la ejecucion