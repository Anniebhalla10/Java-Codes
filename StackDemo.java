/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodes;

/**
 *
 * @author Admin
 */
 class Stack {
   
    private int stck[];
    private int tos;

    Stack(int size)
    {
        stck=new int[size];
        tos=-1;
    }

    public void push(int item) throws Exception
    {
        try
        {
            if(tos==stck.length-1)
            {
                throw new Exception("Stack Full!");
            }
            else
            {
                stck[++tos]=item;
            }
        }
        catch(Exception e)
        {
            throw e;
        }
    }
    
    public int pop() throws Exception
    {
        try
        {
            if(tos<0)
            {
                throw new Exception("Stack Underflow");
            }
            else
            {
                return stck[tos--];
            }
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}

class StackDemo
{
    public static void main(String[] args)
    {
        Stack mystack=new Stack(10);
        
        try
        {
            for(int i=0;i<10;i++)
            {
                mystack.push(i*2);
            }
        }
        catch(Exception e)
        {
            System.out.print("Caught" + e);
        }

        try
        {
            for(int i=0;i<11;i++)
            {
                System.out.print(mystack.pop());
                System.out.print("\n");
            }
        }
        catch(Exception e)
        {
            System.out.print("Caught" + e);
        }
    }
}
    

