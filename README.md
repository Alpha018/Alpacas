
Hermosas alpacas:

¡Científicos del centro para el tratamiento y control de la población, TCP, han realizado un impresionante descubrimiento! Nuestras queridas alpacas, en lugar de portar un código genético compuesto de bases adenina (A), citosina (C), guanina (G) y timina (T), poseen bases completamente distintas: su ADN está compuesto de bases (A), (C), (L) y (P) donde (L) es lanina y (P) es preciosina.
Más aún, los investigadores del TCP descubrieron que el código genérico de las alpacas es extremadamente estructurado. Este se puede codificar como una secuencia sobre el alfabeto {A, C, L, P} aplicando algunas reglas. Partiendo con la letra A la secuencia que describe el ADN puede generarse aplicando N veces el siguiente conjunto de reglas de forma simultánea:

•	Reemplazar cada ocurrencia de (A) por (AL)
•	Reemplazar cada ocurrencia de (L) por (PACA)
•	Reemplazar cada ocurrencia de (P) por (CP)
•	Reemplazar cada ocurrencia de (C) por (PC)

Por ejemplo, si N = 3 la secuencia obtenida será ALPACACPALPCAL:
         A -> AL -> ALPACA -> ALPACACPALPCAL

Los científicos están estudiando la hermosura de las alpacas. Hasta el momento han descubierto que existen M tipos de hermosuras distintas. Y más aún, también han logrado relacionar el tipo de hermosura de una alpaca con la cantidad de veces que la subcadena (ALPACA) aparece en su secuencia de ADN. En particular, si (ALPACA) aparece D veces en la secuencia de ADN de una alpaca, entonces su tipo de hermosura está dado por el resto de la división de D por M. ¿Podrías ayudar a nuestros científicos a determinar qué tan bella es una alpaca en particular?
Entrada
La entrada consiste en una línea que contiene dos números N y M, donde N indica el número de iteraciones que describen el ADN de la alpaca (1 <= N <= 10^15), y M es la cantidad de tipos de hermosura (2 <= M <= 10^9).
Salida
Un único entero que contiene el tipo de hermosura de la alpaca (D mod M).

EJEMPLOS:
1.	IN: N = 1 M = 187	                OUT: 0
2.	IN: N = 2 M = 187	                OUT: 1
3.	IN: N = 3 M = 187	                OUT: 1
4.	IN: N = 10 M = 5000	                OUT: 171
5.	IN: N = 987654321 M = 123456789	    OUT: 41191906
