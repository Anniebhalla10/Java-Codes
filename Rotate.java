import java.util.Scanner;

class Rotate
 {
     public static void main(String args[])
        {
           Scanner sc = new Scanner(System.in);
           System.out.println(" Enter rows and columns for matrix");
           int r= sc.nextInt();
           int c= sc.nextInt();
           int A[][]= new int[r][c];
           System.out.println(" Enter the elements ");
           for(int i=0 ; i<r; i++)
            {
                for(int j=0 ; j<c; j++)
                A[i][j]= sc.nextInt(); 
            } 
                int R[][]= new int[c][r];
                
            for(int a=r-1 ; a>0 ; a--)
             {
                 for(int b=0 ,k=0 ; b<c ; b++,k++)
                 R[b][k]= A[a][b];
             }

             for(int m[]: R)
             {
                 System.out.println();
                for(int z : m)
                System.out.println(z +" ");
             }
        }
 }
