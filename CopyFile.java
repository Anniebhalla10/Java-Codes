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
public class CopyFile {
    public static void main(String[] args) {
        if(args.length==0)
            System.out.println(" Files do not exist");
        else
        {
            File infile = new File("args[0]");
            File outfile = new File("args[1]");
            FileReader ins= null;
            FileWriter outs= null;
            try
            {
                ins = new FileReader(infile);
                outs= new FileWriter(outfile);
                int ch;
                while((ch=ins.read())!=-1)
                {
                    outs.write(ch);
                }
            }
            catch(IOException ioe)
            {
                System.out.println("Exception caught : "+ ioe);
            }
            finally
            {
                try
                {
                    ins.close();
                    outs.close();
                }
                catch(IOException e)
                {
                    System.out.println("Exception caught "+ e);
                }
            }
        }
    }
}
