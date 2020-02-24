/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import p1.TwoDim;

/**
 *
 * @author user1
 */
public class ThreeDim extends TwoDim{
    private double z;
    public ThreeDim()
    {
        super();
        z=0;
    }
    public ThreeDim(double a, double b,double c)
    {
        super(a,b);
        z=c;
    }
    
    public String toString()
    {
        return super.toString()+" , "+z;
    }
    
}
