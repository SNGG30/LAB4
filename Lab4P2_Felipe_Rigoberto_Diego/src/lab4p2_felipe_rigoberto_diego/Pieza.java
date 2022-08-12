/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felipe_rigoberto_diego;

import java.awt.Color;

/**
 *
 * @author felip
 */
public abstract class Pieza implements Movimiento{
    
    int posx;
    int posy;
    char forma;
    String color;

    public Pieza() {
    }
    public Pieza(int posx, int posy, char forma, String color) {
        this.posx = posx;
        this.posy = posy;
        this.forma = forma;
        this.color = color;
    }

    public int getPosx() {
        return posx;
    }
    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }
    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getForma() {
        return forma;
    }
    public void setForma(char forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
