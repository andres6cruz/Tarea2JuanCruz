
package javaapplication21;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = leer.nextLine();
        palabra = palabra.toLowerCase();
        String nuevaPalabra = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                nuevaPalabra += palabra.charAt(i);
            }
        }

        String palabraInvertida = "";
        for (int i = nuevaPalabra.length() - 1; i >= 0; i--) {
            palabraInvertida += nuevaPalabra.charAt(i);
        }

        if (nuevaPalabra.equals(palabraInvertida)) {
            System.out.println("La palabra " + palabra + " es un palíndromo");
        } else {
            System.out.println("La palabra " + palabra + " no es un palíndromo");
        }

    }
}