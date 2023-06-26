
package javaapplication20;

import java.util.Scanner;

public class Mensaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una mensaje: ");
        String msj = leer.nextLine();
        mensaje(msj);
    }

    public static void mensaje(String msj) {
        System.out.println(msj);
    }
}