
package javaapplication23;

import java.util.Scanner;

public class Promedios {

    public static void main(String[] args) {
        int notas = promedios();
        System.out.println("Su promedio es: " + notas);
    }

    public static int promedios() {
        Scanner leer = new Scanner(System.in);
        int notas = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese nota " + i);
            int n = leer.nextInt();
            while (n < 0 || n > 100) {
                System.out.println("Solo debe ingresar notas de 0 a 100: ");
                n = leer.nextInt();
            }
            notas += n;
        }
        notas = notas / 4;
        return notas;
    }
}