package daw;

import java.util.Random;

public class Juego {
    private final int FILAS = 6;
    private final int COLUMNAS=7;
        
    private char[][] tablero;

    public Juego(){
        tablero = new char[FILAS][COLUMNAS];
    }

    public void imprimir(){
        for(int i = 0; i<FILAS;i++){
            System.out.print(" | ");
            for(int j =0; j<COLUMNAS; j++){
                
                System.out.print(tablero[i][j]);
                System.out.print(" ");
            }
            System.out.println(" | ");
        }


    }

    public void colocar(int columna, char jugador){
        int controlador = 1;
        boolean salir;
        do{
           salir = true;
           
            if(tablero[FILAS-controlador][columna]=='\0'){
                tablero[FILAS-controlador][columna]=jugador;
            salir=false;
            } else{
                controlador++;
                
            }
            
            
        } while(salir);
       
    }

    public boolean comprobarFichas(Juego juego, char jugador,int fila, int columna,  int direccionFila,int direccionColumna){

        int contadorVictoria =1;
        //comprobar hacia delante
        int f = fila + direccionFila;
        int c = columna +direccionColumna;

        //hacia delante
        while(f>=0 && f< FILAS &&
            c>=0 && c< COLUMNAS &&
            juego.getTablero()[f][c]== jugador){

                contadorVictoria++;
                f+=direccionFila;
                c+=direccionColumna;
            }
        
        //hacia atras
        f= fila-direccionFila;
        c= columna-direccionColumna;


             while(f>=0 && f< FILAS &&
            c>=0 && c< COLUMNAS &&
            juego.getTablero()[f][c]== jugador){

                contadorVictoria++;
                f-=direccionFila;
                c-=direccionColumna;
            }


        return contadorVictoria>=4;

    }

    public boolean comprobarVictoria(Juego juego, char jugador, int fila, int columna){
        return comprobarFichas(juego, jugador, fila, columna,0,1) || //horizontal
            comprobarFichas(juego, jugador, fila, columna, 1,0) || //vertical
            comprobarFichas(juego, jugador, fila, columna, 1,1) || //diagonal descendente
            comprobarFichas(juego, jugador, fila, columna, 1,-1); //diagonal ascendente
    }

    public int getFILAS() {
        return FILAS;
    }

    public int getCOLUMNAS() {
        return COLUMNAS;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    
}


