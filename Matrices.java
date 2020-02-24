import java.util.Scanner;

class Matrices
{
    public static void main(String args[])
    {
        

        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter r0w and columns for matrix 1");
        int r1 = obj.nextInt();
        int c1= obj.nextInt();
        int A[][] = new int[r1][c1];

        System.out.println(" Enter row and column for matrix 2");
        int r2 = obj.nextInt();
        int c2= obj.nextInt();
        int B[][]= new int [r2][c2];

        System.out.println(" Enter matrix 1 ");
        for(int i=0;i<r1;i++)
            {
                for(int j=0; j<c1; j++)
                 A[i][j]= obj.nextInt();
            }

            System.out.println(" Enter matrix 2 ");
            for(int i=0;i<r2;i++)
                {
                    for(int j=0; j<c2; j++)
                     B[i][j]= obj.nextInt();
                }
            
            char ch;

        do
        {
            System.out.println(" Menu ");
            System.out.println(" 1. Add matrices ");
            System.out.println(" 2. Multiply Matrices ");
            System.out.println(" Enter your choice ");
            int choice= obj.nextInt();
            switch(choice)
                {
                   
                    case 1: addition( A , B , r1 , r2 , c1 , c2);
                            break;
                    case 2: multiply(A , B , r1 , r2, c1, c2);
                            break;
                    default: System.out.println(" Enter a valid choice ");
                    
                }
                System.out.println(" Do you want to continue Y/N");
                 ch = obj.next().charAt(0);
         } while(ch== 'Y' || ch== 'y');           

    }

   static void addition(int X[][] , int Y[][], int r1 , int r2 , int c1, int c2)
        {
            
                if(r1==r2 || c1==c2 )
                 {
                    int C[][]= new int[r1][c1];
                    for(int i=0 ; i<r1 ; i++)
                        {
                            for(int j=0; j<c1; j++)
                             C[i][j]= X[i][j] + Y[i][j];
                        }

                    System.out.println(" Resultant matrix is ");
                    // for(int a=0 ; a<r1; a++, System.out.println())
                    // {
                    //     for(int b=0; b<c1; b++)
                    //     System.out.print(C[a][b] + " ");
                    // }
                    for(int[]y : C )
                    {   
                        System.out.println();
                        for(int x : y )
                        System.out.print(x+" ");
                    }
                 }
                else
                {
                    System.out.println(" Matrices cannot be added ");
                    System.exit(0);
                }

        }


        static void multiply( int X[][] , int Y[][], int r1 , int r2 , int c1, int c2)
        {
            if( c1==r2)
            {   
                int C[][]= new int[r1][c2];
                for(int i=0 ; i<r1 ; i++)
                {
                    for(int j=0 ; j<c2 ; j++ )
                      {      int sum=0;
                           for(int k=0 ; k<c1 ; k++)
                           sum = sum + (X[i][k] * Y[ k][j]); 
  
                           C[i][j]= sum;
                        }

                }

                System.out.println(" Resultant matrix is ");
                for(int a=0 ; a<r1; a++, System.out.println())
                {
                    for(int b=0; b<c2; b++)
                    System.out.print(C[a][b]+" ");
                }
             }
            
            else
            {
                System.out.println(" Matrices cannot be added ");
                System.exit(0);
            }

        }
    
   
}

