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
public class FactDemo {
    public static void main(String[] args) {
        Factorial F= new Factorial();
        System.out.println(F.fact(3));
        System.out.println(F.fact(2));
    }
    
}

class Factorial
{
    // recursive method
    int fact(int n)
    {
        int result;
        if(n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}


