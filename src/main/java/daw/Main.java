package daw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Juego conecta4 = new Juego();
        char jugador1 = 'X';
        char jugador2 = 'O';

        Scanner tec = new Scanner(System.in);

        int turnoJugador = 1;
        boolean finDelJuego;

        do {
            finDelJuego = true;

            if (turnoJugador % 2 != 0) {
                // juega el jugador uno
                System.out.println(" Jugador 1, ¿En que columna quieres poner la ficha?");
                int columna;
                do {
                    columna = tec.nextInt();
                    if (columna < 0 || columna > 6) {
                        System.out.println("te has salido del tablero");
                    }
                } while (columna < 0 || columna > 6);
                int fila;
                try{
                     fila = conecta4.colocar(columna, jugador1);
                
                
                conecta4.imprimir();
                if (conecta4.comprobarVictoria(conecta4, jugador1, fila, columna)) {
                    System.out.println(" El jugador 1 ha ganado");
                    finDelJuego = false;
                }
                }  catch (IndexOutOfBoundsException iobe) {
                    System.out.println("esa columna esta llena");
                }
                turnoJugador++;
            } else {
                // juega el jugador 2
                System.out.println(" Jugador 2, ¿En que columna quieres poner la ficha?");
                int columna;
                do {
                    columna = tec.nextInt();
                    if (columna < 0 || columna > 6) {
                        System.out.println("te has salido del tablero");
                    }
                } while (columna < 0 || columna > 6);
                int fila;
                try{
                 fila = conecta4.colocar(columna, jugador2);
                
                
                conecta4.imprimir();
                if (conecta4.comprobarVictoria(conecta4, jugador2, fila, columna)) {
                    System.out.println(" El jugador 2 ha ganado");
                    finDelJuego = false;
                }
            } catch (IndexOutOfBoundsException iobe) {
                System.out.println("Esta columna esta llena ");
            }
                turnoJugador++;
            }

        } while (finDelJuego);

    }
}