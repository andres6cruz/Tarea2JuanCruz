
package javaapplication22;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de los numeros");
        int tam = leer.nextInt();
        int contPar = 0, contImpar = 0;
        String par = "", impar = "";
        for (int i = 0; i <= tam; i++) {
            if (i % 2 == 0) {
                par += i + ", ";
                contPar++;
            } else {
                impar += i + ", ";
                contImpar++;
            }
        }
        System.out.println("Entre 0 y " + tam + " existen " + contPar + " numeros pares y estos son: " + par);
        System.out.println("Entre 0 y " + tam + " existen " + contImpar + " numeros impares y estos son: " + impar);
    }
}
