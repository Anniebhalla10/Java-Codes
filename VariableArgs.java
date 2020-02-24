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
public class VariableArgs {
    static void Test(int...v)
    {
        System.out.println( " No. of arguements "+ v.length + " contents : " );
        for(int b:v)
            System.out.println(b+" ");
         System.out.println();
    }
    
    public static void main(String args[])
    {
        Test(10);
        Test(1,20,30,40,70);
        Test();
    }
}
