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
public class BRReadLines {    
    public static void main(String[] args) throws IOException {
        // creating buffered reader using system.in
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String str[]= new String[100]; //array of object of class string
        System.out.println(" Enter lines of text and enter stop to exit");
        for(int i=0;i<100;i++)
        {
            str[i]= obj.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("This is your file : ");
        for(int i=0;i<100;i++)
        {
           if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
        
    }
}
