

package javaapplication18;

import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena: ");
        String cadena1 = leer.next();
        System.out.println("Ingrese la segunda cadena: ");
        String cadena2 = leer.next();
        boolean flag = contiene(cadena1, cadena2);
        if (flag) {
            System.out.println("La cadena " + cadena2 + " esta contenida en " + cadena1);
        }else{
            System.out.println("La cadena " + cadena2 + " no esta contenida en " + cadena1);
        }
    }

    private static boolean contiene(String cadena1, String cadena2) {
        boolean flag;
        if (cadena1.contains(cadena2)) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }
}
