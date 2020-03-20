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
public class BufferInput {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter q to exit");
        do{
            c = (char)br.read();
            System.out.println(c);
            
        }while(c!='q'|| c!='Q');
        System.out.println("Thankyou");
   }
}
