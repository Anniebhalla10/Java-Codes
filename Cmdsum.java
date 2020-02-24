import java.util.Scanner;

class Cmdsum
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
       long sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the numbers ");
        for(int i=0;i<n;i++)
        {
            sum = sum + sc.nextInt();
        }
        System.out.println(" Sum of the numbers is " + sum);
    }
}