/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;
import pack1.Shape;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class Rectangle extends Shape {
    double size2;
    
    public Rectangle()
    {
       this(0,0);
    }
    public Rectangle(double a,double b)
    {
        size1=a;
        size2=b;
    }
    public void area()
    {
         area= size1*size2;
        
    }
    public void input()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length and breadth of the Rectangle : ");
        double x= scan.nextDouble();
        double y=scan.nextDouble();
        size1=x;
        size2=y;
    }
    public void display(){
            System.out.println("The area of Rectangle is : "+ area);
        }
}
