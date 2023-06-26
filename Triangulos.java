
package javaapplication25;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1. triangulo equilatero");
        System.out.println("2. triangulo rectangulo");
        System.out.println("3. salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = leer.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese tamaño del triangulo equilatero: ");
                    int tamanio = leer.nextInt();
                    for (int i = 0; i < tamanio; i++) {
                        for (int j = tamanio - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Ingrese tamaño del triangulo rectangulo: ");
                    int tam = leer.nextInt();
                    for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("1. triangulo equilatero");
            System.out.println("2. triangulo rectangulo");
            System.out.println("3. salir");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();
        }
    }
}