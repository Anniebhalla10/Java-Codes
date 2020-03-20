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
public class PrintArray {
    int values[];
    PrintArray(int i)
    {
        values= new int[i];
    }
    
    void print(int i)
    {
        if(i==0)
            return;
        else
             print(i-1);
        System.out.println("["+ (i-1) + "] "+ values[i-1]);
    }
}

class Test
{
    public static void main(String[] args) {
        PrintArray obj= new PrintArray(10);
        int x;
        for(x=0;x<10;x++)
            obj.values[x]=x;
        obj.print(10);
    }
}