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


