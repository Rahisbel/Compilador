;        -> Inicio
;        -> if
LOD 1
        ;id: carga valor de identificador: j
;        -> constante
LDC 5
        ;constante: cargar constante: 5
ADI
        ;op: +
;        <- Operacion: mas
LOD 0
        ;id: carga valor de identificador: i
GRT
        ;A mayor que B: B<A
FJP L1
        ;if false: JMP - else
;        -> if
LOD 0
        ;id: carga valor de identificador: i
;        -> constante
LDC 0
        ;constante: cargar constante: 0
EQU
        ;op: ==
;        <- Operacion: igual
FJP L2
        ;if false: JMP - else
LDA 0
        ;cargar direccion de identificador: i
;        -> constante
LDC 2
        ;constante: cargar constante: 2
STO
        ;asignacion: valor - id i
;        -> if
LOD 0
        ;id: carga valor de identificador: i
;        -> constante
LDC 2
        ;constante: cargar constante: 2
EQU
        ;op: ==
;        <- Operacion: igual
FJP L3
        ;if false: JMP - else
;        -> escribir
LOD 1
        ;id: carga valor de identificador: j
WRI
        ;escribir: valor de tope
;        <- escribir
UJP L4
        ;label: UJP
LAB L3
        ;label: jmp
;        -> leer
LDA 1
        ;leer: cargar direccion de identificador j
RDI 1
        ;leer: valor para el identificador j
;        <- leer
LAB L4
        ;label: UJP
;        <- if
LAB L2
        ;label: jmp
;        <- if
UJP L5
        ;label: UJP
LAB L1
        ;label: jmp
LDA 0
        ;cargar direccion de identificador: i
;        -> constante
LDC 0
        ;constante: cargar constante: 0
STO
        ;asignacion: valor - id i
LAB L5
        ;label: UJP
;        <- if
STP
        ;Fin
;        <- Fin de la ejecucion