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
public class strings {
    
    public static void main(String args[])
    {
        
       Scanner obj = new Scanner(System.in);        
       String s1,s2,s3,s4;
       System.out.println(" Enter string 1");
       s1= obj.next();
       System.out.println(s1);
       System.out.println(" Enter a new string ");
       s2= obj.next();
       System.out.println(s2);
      // s3= s1.setCharAt(2,'*');
     //  System.out.println(s3);
      // s4= s1.append(s2);
      // System.out.println(s4);
       String s5= s1.concat(s2);
       System.out.println(s5);
       boolean x= s1.equals(s2);
       System.out.println(x);
       
        
    }
    
}
