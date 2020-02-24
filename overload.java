/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogrammes;

/**
 *
 * @author user1
 */
public class overload {
    public static void main(String args[])
    {
        OverloadDemo ob= new OverloadDemo();
        double result;
        int i=88;
        ob.test();
        ob.test(i);//int value is converted to higher value
        ob.test(10);
        ob.test(10,20);
        ob.test(123.25);
        
    }
}

class OverloadDemo
{
     
    void test()
    {
        System.out.println(" No parameters ");
    }
    void test(int a)
    {
        System.out.println(" a: " + a);
    }
   
    void test(int a, int b)
    {
        System.out.println(" a: " + a +" b: "+b);
    }
    void test(double a)
    {
        System.out.println("doUBLE a: " + a*a*a);
        
    }
}