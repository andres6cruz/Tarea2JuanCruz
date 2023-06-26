
package tareasjuancruz;

import java.util.Scanner;

/**
 *
 * @author Juan Andres Cruz
 */
public class AprobadoReprobado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nota: ");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 100) {
            System.out.println("Solo debe ingresar notas de 0 a 100: ");
            nota = leer.nextInt();
        }
        boolean flag = notas(nota);
        if (flag) {
            System.out.println("Felicidadesm usted aprobo");
        } else {
            System.out.println("Estimado estudiante, usted a reprobado");
        }
    }

    private static boolean notas(int nota) {
        boolean flag;
        if (nota >= 60) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}