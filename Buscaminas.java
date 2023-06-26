
package com.mycompany.buscaminas;


import java.util.Scanner;

public class Buscaminas {

    static int fila = 5;
    static int columna = 5;
    static int bomba = 5;
    static boolean[][] Ataques;
    static char[][] tablero;
    static boolean[][] bombas;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("______");
        System.out.println("__BUSCAMINAS__");
        System.out.println("______");
        int modoJuego = modoJuego(leer);
        tableroInicial();
        bombasTablero();
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("_____");
            System.out.println("__Tablero__");
            System.out.println("_____");
            imprimirTablero(modoJuego);

            System.out.println("Ingrese las coordenadas (fila y columna) para atacar(debe de dejar un espacio (0 1 como ejemplo)): ");
            int fila = leer.nextInt();
            int columna = leer.nextInt();

            if (coordenadas(fila, columna)) {
                if (casillasAtaques(fila, columna, modoJuego)) {
                    gameOver = true;
                }
            } else {
                System.out.println("Coordenadas inválidas. Intente de nuevo.");
            }
        }
    }

    private static int modoJuego(Scanner leer) {
        System.out.println("");
        System.out.println("Seleccione el modo de juego:");
        System.out.println("1. Modo Silencioso");
        System.out.println("2. Modo Simple");
        int modo = leer.nextInt();
        while (modo != 1 && modo != 2) {
            System.out.println("Opción inválida. Intente de nuevo.");
            modo = leer.nextInt();
        }
        return modo;
    }

    private static void tableroInicial() {
        tablero = new char[fila][columna];
        Ataques = new boolean[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tablero[i][j] = '|';
                Ataques[i][j] = false;
            }
        }
    }

    private static void bombasTablero() {
        bombas = new boolean[fila][columna];
        int bombasColocadas = 0;
        while (bombasColocadas < bomba) {
            int fila = (int) (Math.random() * Buscaminas.fila);
            int columna = (int) (Math.random() * Buscaminas.columna);

            if (!bombas[fila][columna]) {
                bombas[fila][columna] = true;
                bombasColocadas++;
            }
        }
    }

    private static void imprimirTablero(int modoJuego) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (Ataques[i][j]) {
                    System.out.print(tablero[i][j]);
                } else if (modoJuego == 2 && bombas[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print("|");
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    private static boolean coordenadas(int fila, int columna) {
        if (fila >= 0 && fila < Buscaminas.fila && columna >= 0 && columna < Buscaminas.columna) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean casillasAtaques(int fila, int columna, int modoJuego) {
        if (bombas[fila][columna]) {
            imprimirTablero(modoJuego);
            System.out.println("BOOOOOM! Has encontrado una bomba. ¡Juego terminado!");
            return true;
        } else {
            Ataques[fila][columna] = true;
            tablero[fila][columna] = 'X';
            return false;
        }
    }
}