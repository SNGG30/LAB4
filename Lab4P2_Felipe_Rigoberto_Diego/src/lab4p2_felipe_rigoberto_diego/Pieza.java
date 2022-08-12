/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_felipe_rigoberto_diego;

/**
 *
 * @author felip
 */
public abstract class Pieza implements Movimiento{
    
    int posx;
    int posy;

    public Pieza() {
    }
    public Pieza(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
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
    
    
    
}
