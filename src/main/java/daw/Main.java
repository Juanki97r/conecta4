package daw;

public class Main {
    public static void main(String[] args) {
        
        Juego conecta4 = new Juego();
        char jugador1='X';
        char jugador2='O';
        try{
        conecta4.colocar(3, jugador2); 
        } catch(IndexOutOfBoundsException ieoe){
            System.out.println("La columna esta llena");
        }
        conecta4.colocar(4, jugador1);
        conecta4.colocar(4, jugador2);
        conecta4.colocar(3, jugador1);
        conecta4.imprimir();

    }
}