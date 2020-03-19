import java.util.Scanner;
class UnderAge extends Exception
{

    private int a;
    UnderAge(int m)
    {
        a=m;
    }
    public String toString()
    {
        return "Under Age : "+a;
    }
}

class ExceptionDemo
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
     
        System.out.println("ENter age : ");
        int age= obj.nextInt();
            try{
                test(age);
            }
            catch(UnderAge e)
        {
            System.out.println(e);
        }
            
        
        
    }

    static void test(int n) throws UnderAge
    {
        
        
            if(n<18) throw new UnderAge(n);
         else 
          System.out.print("NOT UNDERAGE");
        
       
    }
}