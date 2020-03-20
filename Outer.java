/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Admin
 */
public class Outer {
   
        int outer_x=100;
        void test()
        { for(int i=0;i<10;i++)
            {
            class Inner
            {
                void display()
                {
                    //inner class can access members of the enclosed class but 
                    //the reverse is not true
                    System.out.println("value of x in outer class is : "+ outer_x);
                }
            }
                Inner inner = new Inner();
                inner.display();
         }
    }
}

class Demo
{
    public static void main(String[] args) {
        Outer outer= new Outer();
        outer.test();
    }
}
    
