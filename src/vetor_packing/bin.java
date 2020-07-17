/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_packing;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

/**
 *
 * @author student
 */
public class bin {
    int x;
    int y;
    int sum;
    int binNumber;
    int binUsed;

    public bin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    bin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setMaxTotal(){
      this.sum=this.x+this.y;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getmaxTotal(){
        return x+y;
    }
    public int getmax_max(){
        return  max(this.x, this.y);
    }
    
     public int getmax_min(){
        return  min(this.x, this.y);
    }

    public int getBinUsed() {
        return binUsed;
    }

    public void setBinUsed(int binUsed) {
        this.binUsed = binUsed;
    }
    
    
}
