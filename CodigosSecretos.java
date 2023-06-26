
package javaapplication17;

import java.util.Scanner;

public class CodigosSecretos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una entrada: ");
        String entrada = leer.next();
        String salida = "";

        for (int i = 0; i < entrada.length(); i += 2) {
            char caracter = entrada.charAt(i);
            int cantidad = entrada.charAt(i + 1) - '0';
            for (int j = 0; j < cantidad; j++) {
                salida += caracter;
            }
        }

        System.out.println("Salida: " + salida);
    }
}
