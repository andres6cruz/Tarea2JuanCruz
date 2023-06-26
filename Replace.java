
package javaapplication24;

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = leer.next();
        System.out.println("Ingrese la letra que quiere sustituir");
        String letra = leer.next();
        System.out.println("Ingrese la letra nueva");
        String letraNueva = leer.next();
        cadena = cadena.replace(letra, letraNueva);
        System.out.println("Cadena nueva: " + cadena);
    }
}