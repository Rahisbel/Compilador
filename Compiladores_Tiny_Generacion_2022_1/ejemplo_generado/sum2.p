;        -> Inicio
LDA 0
        ;cargar direccion de identificador: y
;        -> constante
LDC 9
        ;constante: cargar constante: 9
STO
        ;asignacion: valor - id y
LDA 1
        ;cargar direccion de identificador: x
LOD 0
        ;id: carga valor de identificador: y
;        -> constante
LDC 1
        ;constante: cargar constante: 1
ADI
        ;op: +
;        <- Operacion: mas
STO
        ;asignacion: valor - id x
;        -> escribir
LOD 1
        ;id: carga valor de identificador: x
WRI
        ;escribir: valor de tope
;        <- escribir
STP
        ;Fin
;        <- Fin de la ejecucion
