import java.util.*;

class DecimalBinary
{
    public static void main(String args[])
    {   String s="";
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        
        //int a[]= new int[10];
        // String x =50+40+"Hello"+90+6;
        // System.out.print(x);
        while(num>0)
        {
            //a[i++]=num%2;
            s= s+(num%2);
            //strcat(s,num%2);
            num=num/2;
        }
              
        // System.ourint(hh);
         // for(int k=i-1 ; k>=0; k--)
        // System.out.print(a[k]+" ");
        char [] N = s.toCharArray();
        for(int i=N.length-1 ; i>=0 ; i--)      
        System.out.print(N[i]);
    }
}