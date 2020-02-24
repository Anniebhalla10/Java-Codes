/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author user1
 */
public class TwoDim {
    private double x;
    private double y;
    public TwoDim()
    {
        x=0;
        y=0;
    }
    public TwoDim(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return x+" , "+y;
    }
    
}
