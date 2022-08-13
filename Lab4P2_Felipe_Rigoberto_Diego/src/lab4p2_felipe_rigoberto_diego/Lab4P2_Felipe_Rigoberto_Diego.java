/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felipe_rigoberto_diego;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author felip
 */
public class Lab4P2_Felipe_Rigoberto_Diego {

    static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pieza[][] table = new Pieza[8][8];
        boolean wincon = false;
        boolean temp = false;
        String col = "";
        
        fill(table);
        int turn = 1;
        lea = new Scanner(System.in);
        System.out.print("Ingrese su nombre jugador 1: ");
        String ply1 = lea.nextLine();
        
        lea = new Scanner(System.in);
        System.out.print("Ingrese su nombre jugador 2: ");
        String ply2 = lea.nextLine();
        
        System.out.println();
        
        while(wincon == false){
            print(table);
            
            if(turn % 2 != 0){
               System.out.print("Turno de " + ply1);
               System.out.println();
               col = "white";
            }else{
               System.out.print("Turno de " + ply2);
               System.out.println();
               col = "black";
            }
            
            System.out.print("--Movimiento--");
            System.out.println();
            lea = new Scanner(System.in);
            System.out.print("Ingrese un movimiento <tipo de pieza>|<fila actual>|<columna actual>|<fila destino>|<columna destino>: ");
            String move = lea.nextLine();
            
            String [] tokens = move.split("|");
            String t = tokens[10];
            System.out.println(t);
            turn++;
        }
        
        
    }
    
    public static Pieza[][] fill (Pieza[][] table){
        
        table[0][0] = new Torre(0, 0, 'r', "black");
        table[0][1] = new Caballo(0, 1, 'n', "black");
        table[0][2] = new Alfil(0, 2, 'b', "black");
        table[0][3] = new Rey(0, 3, 'k', "black");
        table[0][4] = new Reina(0, 4, 'q', "black");
        table[0][5] = new Alfil(0, 5, 'b', "black");
        table[0][6] = new Caballo(0, 6, 'n', "black");
        table[0][7] = new Torre(0, 7, 'r', "black");
        
        for (int i = 0; i < table.length; i++) {
            table[1][i] = new Peon(1, i, 'p', "black");
        }
        
        table[7][0] = new Torre(7, 0, 'R', "white");
        table[7][1] = new Caballo(7, 1, 'N', "white");
        table[7][2] = new Alfil(7, 2, 'B', "white");
        table[7][3] = new Rey(7, 3, 'K', "white");
        table[7][4] = new Reina(7, 4, 'Q', "white");
        table[7][5] = new Alfil(7, 5, 'B', "white");
        table[7][6] = new Caballo(7, 6, 'N', "white");
        table[7][7] = new Torre(7, 7, 'R', "white");
        
        for (int i = 0; i < table.length; i++) {
            table[6][i] = new Peon(6, i, 'P', "white");
        }
        return table;
    }
    public static void print(Pieza[][] table){
        
        int cont = 1;
        char piece;
        System.out.print("0  A  B  C  D  E  F  G  H");
        System.out.println();
        for(int i = 0;  i < table.length; i++){
            System.out.print(cont + " ");
            for (int i2 = 0; i2 < table.length; i2++) {
                System.out.print("[");
                if(table[i][i2] != null){
                piece = table[i][i2].getForma();
                System.out.print(piece);    
                }else    
                System.out.print(" ");
                System.out.print("]");
            }
            System.out.println("");
            cont++;
        }
    }
    
    public static boolean movpeon(int x, int y, Peon peon, Pieza table[][]) {

        if ( peon.getColor().equals("white")) {
            if (x == peon.getPosx() && (y != peon.getPosy() + 1 || table[y][x] != null)) {
                System.out.println("Movimiento no posible");
                return false;
            }// fin del segundo if
            // fin del primer if
            else if (x != peon.getPosx() + 1 || y != peon.getPosy() + 1) {
                System.out.println("Movimiento no valido");
                return false;
               }
             else if (table[y][x].getColor().equals("white")) {
                System.out.println("Movimiento no valido");
                return false;
            }
                else {
                return true;

            }

        }//fin del primer if
        else {
            
        
         if (x == peon.getPosx() && (y != peon.getPosy() - 1 || table[y][x] != null)) {
                System.out.println("Movimiento no posible");
                return false;
            }// fin del segundo if
            // fin del primer if
            else if (x != peon.getPosx() - 1 || y != peon.getPosy() - 1) {
                System.out.println("Movimiento no valido");
                return false;
               }
             else if (table[y][x].getColor().equals("black")) {
                System.out.println("Movimiento no valido");
                return false;
            }
                else {
                return true;

            }
        }// fin del else
        
    }// fin de movpeon
}
