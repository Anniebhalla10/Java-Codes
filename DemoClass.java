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
public class DemoClass {
    public static void main(String args[])
    {
        TwoDim O1= new TwoDim(3,6);
        System.out.println(O1);
        ThreeDim O2= new ThreeDim(8,7,6);
        System.out.println(O2);
        
        TwoDim O3= new ThreeDim(9,9,9);
        System.out.println(O3);
        
    }
            
}
