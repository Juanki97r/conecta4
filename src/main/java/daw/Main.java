package daw;

public class Main {
    public static void main(String[] args) {
        
        Juego conecta4 = new Juego();
        char jugador1='X';
        char jugador2='O';

        conecta4.rellenar(3, jugador2);
        conecta4.rellenar(4, jugador1);
        conecta4.rellenar(4, jugador2);
        conecta4.imprimir();

    }
}