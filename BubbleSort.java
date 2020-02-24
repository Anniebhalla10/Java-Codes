import java.util.Scanner;

class BubbleSort
   {
       public static void main(String args[])
       {
           Scanner sc= new Scanner(System.in);
           System.out.print(" Enter size ");
           int length= sc.nextInt();
           int a[]= new int[length];
           System.out.println(" Enter elements ");
           
           for( int k=0 ; k<length ; k++ )
             a[k]= sc.nextInt();
            
             for( int i=0 ; i<length-1 ; i++ )
           {
               for( int j=0 ; j<length-i-1 ; j++ )
               {
                   if(a[j]>a[j+1])
                    {
                        int temp;
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
               }
           }
           for( int k=0 ; k<length ; k++ )
             System.out.print(a[k]+  " ");
       }
   }