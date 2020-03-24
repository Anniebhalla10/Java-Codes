/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodes;
import java.io.*;

/**
 *
 * @author Admin
 */
public class CopyText {
    
    public static void main(String[] args)
    {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        if(args.length!=2)
        {
            System.out.print("Usage: ShowFile filename");
            return;
        }

        try
        {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
        }
        catch(FileNotFoundException e)
        {
            System.out.print("Error Opening File");
            return;
        }

        try
        {
            do
            {
                i=fin.read();
                if(i!=-1)
                {
                    fout.write((char)i);
                }
            }while(i!=-1);
        }
        catch(IOException e)
        {
            System.out.print("Error Reading File");
        }

        try
        {
            fin.close();
            fout.close();
        }
        catch(IOException e)
        {
            System.out.print("Error Closing File");
        }
    }
}

