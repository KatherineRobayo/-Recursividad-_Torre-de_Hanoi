package org.example;

public class Torre_de_Hanoi {
    // metodo recursivo para resolver el juego de las Torres de Hanoi
    public static void hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) { // Si solo hay un disco, se mueve directamente al destino
            System.out.println("Mover disco 1 de " + origen + " a " + destino); // Imprime el movimiento del disco
            return; // Termina la ejecución para este caso base
        }
        hanoi(n - 1, origen, destino, auxiliar); // // Mueve n-1 discos desde la torre de origen a la torre auxiliar, usando la torre destino como auxiliar
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, origen, destino); // Mueve los n-1 discos desde la torre auxiliar a la torre destino, usando la torre origen como auxiliar
    }

}
