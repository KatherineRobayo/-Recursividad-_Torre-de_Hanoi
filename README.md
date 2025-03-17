# -Recursividad-_Torre-de_Hanoi

PROGRAMA PARA SOLUCIONAR EL PROBLEMA DE LA TORRE DE HANOI

INTEGRANTES
ANGIE KATHERINE ROBAYO ANGEL
JHON SEBASTIAN MURCIA ROMERO

DESCRIPCION DEL PROYECTO:

Este proyecto implementa una solución recursiva para el problema de las Torres de Hanoi, un clásico desafío matemático y de programación. Su objetivo es mover una pila de discos desde una torre de origen hasta una torre de destino, siguiendo tres reglas fundamentales:

1. Solo se puede mover un disco a la vez.
2. Un disco no puede colocarse sobre un disco más pequeño.
3. Solo se pueden usar tres torres: origen, auxiliar y destino.

El programa solicita al usuario el número de discos y luego genera la secuencia exacta de movimientos para resolver el problema, utilizando un algoritmo recursivo.

PASOS PARA EL FUNCIONAMIENTO

1. En la clase se declara el método hanoi(int n, char origen, char auxiliar, char destino).
2. Se establece que Si n == 1, mover directamente el disco de la torre de origen a la torre de destino e imprimir el movimiento.
3. Se llama recursivamente a hanoi() para mover los n-1 discos de la torre de origen a la torre auxiliar, usando la torre destino como auxiliar.
4. Se imprime el movimiento del disco más grande desde la torre de origen a la torre destino.
5. Se llama recursivamente a hanoi() para mover los discos desde la torre auxiliar a la torre destino, usando la torre origen como auxiliar.
6. Se crea un objeto Scannerllamado entradapara leer datos del usuario.
7. Se muestra un mensaje en consola pidiendo el número de discos.
8. See lee el número ingresado y se almacena en la variable n.
9. Se cierra el Scannerpara liberar recursos.
10. Se imprime un mensaje indicando que se mostrarán los movimientos.
11.  Se llama al método hanoi(n, 'A', 'B', 'C')para resolver el problema.