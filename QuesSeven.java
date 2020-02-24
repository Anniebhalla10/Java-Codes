import java.util.Scanner;

class QuesSeven
{
   public static void main(String args[])
   {    
       int sum=0;
       int l= Integer.parseInt(args[0]);
       Scanner sc = new Scanner(System.in);
       for(int i=0; i<l ; i++)
            sum = sum + sc.nextInt();
        System.out.println(" Sum of numbers is "+ sum);
    


   }
}