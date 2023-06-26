
package javaapplication19;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero factorial: ");
        int num = leer.nextInt();
        int factorial = factorial(num);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}