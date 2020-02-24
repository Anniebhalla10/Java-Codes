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
public class AccessControl {
    public static void main(String args[])
    {
        Control obj= new Control();
        obj.a=16;
        obj.b= 2001;
      //  obj.c= 07;  not allowed because c is private to class access control
      obj.set(100); //  private members accessed through methods 
      System.out.println(" a,b and c : "+ obj.a+" "+ obj.b + " "+ obj.get_c() );
      // obj.x= ob.x+40; not allowed bcz final data member
      System.out.println(obj.x);
    }
}

class Control
{
    int a; //default
    public int b; 
    private int c;
    final public int x=100;
    void set(int i)   // to set value of c
    {
      c=i;  
    }
    int get_c()
    {
        return c;
    }
}