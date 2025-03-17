package org.example;

import java.util.Scanner; //Se importa la clase Scanner para la entrada de datos por parte de usuario

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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Se crea el objeto entrada tipo Scanner
        System.out.print("Ingrese el número de discos: "); //Se solicita el numero de discos
        int n = entrada.nextInt(); //Lee el numero de discos ingresados por el usuario y lo almacena an n
        entrada.close(); //Se cierra el Scanner

        System.out.println("Secuencia de movimientos:"); //Se imprime un mensaje antes de los movimientos
        hanoi(n, 'A', 'B', 'C'); // Llamada al metodo hanoi con los valores iniciales
    }

}


