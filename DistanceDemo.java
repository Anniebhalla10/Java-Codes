/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrammes;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class DistanceDemo {
    public static void main(String args[])
    {
       Distance D = new Distance(); 
       Scanner ob= new Scanner(System.in);
       double ft,in;
       System.out.println(" Enter feet ");
       ft= ob.nextDouble();
       System.out.println(" Enter inches ");
       in= ob.nextDouble();
       if(in>12)
       {
           ft= ft+ in/12;
           in=in%12;
       }
       D.set(ft,in);
       Distance D2= new Distance(in, ft);
       D.display();
       D2.display();
       Distance D3;
       D3=D2;
       D3.display();
       
    }
}

class Distance
{
    double feet;
    double inches;
    void set(double feet,double inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    Distance(double a, double b)
    {
        feet=a;
        inches=b;
    }
    Distance()
    {
        feet=0;
        inches=0;
    }
    void display()
    {
        System.out.println(" Value of feet is " + feet);
        System.out.println(" Value of inches is " + inches);
    }
    
}