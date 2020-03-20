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
public class VarArgs {
    // finction that uses variable length arguments
    static void vagtest(int...v)
    {
        System.out.println("Number of args : "+ v.length +" Contents : ");
        for(int x:v)
        {System.out.print(x+" ");}
        System.out.println();
    }
    static void vagtest(boolean...v)
    {
        System.out.println("Number of args : "+ v.length +" Contents : ");
        for(boolean x:v)
        {System.out.print(x+" ");}
        System.out.println();
    }
    static void vagtest(String msg, int...v)
    {
        System.out.println(msg);
        System.out.println("Number of args : "+ v.length +" Contents : ");
        for(int x:v)
        {System.out.print(x+" ");}
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        // vagtest can be called with different number of arguments
        vagtest(10);
        vagtest(1,4,6,5,3,6,8);
        // vagtest(); this will cause ambiguity because boolean and int versions of vagtest can be invoked using this
        vagtest(19,67,66,5,4,3,4,5,6,7,7,5,34,4,6,8);
        vagtest("Testing :", 6,7,8,8,9,7,6);
        vagtest(false,true,true,false,true,true,false,false);
    }
}
