/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import java.io.*;

/**
 *
 * @author Admin
 */
public class PWoutput {
    public static void main(String[] args) {
        PrintWriter obj = new PrintWriter(System.out, true);
        obj.println("This is  a string");
        int i=-3;
        obj.println(i);
        double d= 4.5e-7;
        obj.println(d);
    }
}
