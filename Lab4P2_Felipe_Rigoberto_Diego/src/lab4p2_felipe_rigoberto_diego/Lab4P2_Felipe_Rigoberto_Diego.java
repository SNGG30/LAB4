/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felipe_rigoberto_diego;

import java.util.Scanner;

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
        
        lea = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador 1: ");
        String ply1 = lea.nextLine();
        
        lea = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador 2: ");
        String ply2 = lea.nextLine();
        
        while(wincon == false){
            
        }
        
        
    }
    
    public static Pieza[][] fill (Pieza[][] table){
        
        for(int i = 0; i < table.length; i++){
            for(int i2 = 0; i2 < table[i].length; i2++){
                if(i == 0 && i2 == 0 || i == 0 && i2 == 7){
                    table[i][i2] = 'r';
                }else if(i == 0 && i2 == 1 || i == 0 && i2 == 6){
                    table[i][i2] = 'n';
                }else if(i == 0 && i2 == 2 || i == 0 && i2 == 5){
                    table[i][i2] = 'b';
                }else if(i == 0 && i2 == 3){
                    table[i][i2] = 'k';
                }else if(i == 0 && i2 == 4){
                    table[i][i2] = 'q';
                }
            }
        }
        
        return table;
    }
    
}
