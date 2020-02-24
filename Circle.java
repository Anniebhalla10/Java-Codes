/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack3;
import pack1.Shape;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class Circle extends Shape {
    public Circle()
    {
        this(0);
    }
    public Circle(double r)
    {
        size1=r;
    }
    public void area()
    {
        area= Math.PI*size1*size1;
    }
    public void display()
    {
        System.out.println(" The area of Circle is :"+ (area));
    }
    public void input()
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter th eradius of circle ");
        double k= obj.nextDouble();
        size1=k;
     }
}
