import java.util.Scanner;
class Prime
 {
       public static void main( String args[])
       {
           int l= args.length;
           if(l>0)
           {
               int ctr=1;
               int num=Integer.parseInt(args[0]);
               for(int i=2 ;i<num/2 ;i++)
                {
                    if(num%i==0)
                      ctr++;
                }
                if(ctr>1)
                System.out.println(" NOT PRIME ");
                else
                   System.out.println(" Prime");
           }
           else
           {
               Scanner Sc=new Scanner(System.in);
               System.out.println(" Enter a number");
               int num= Sc.nextInt();
               int count=0;
               for(int j=2; j<num/2 ; j++)
               {
                   if(num%j==0)
                     count++;
               }
               if(count>1)
               System.out.println(" NOT Prime");
               else 
               System.out.println(" Prime");

               
           }
       }
 }