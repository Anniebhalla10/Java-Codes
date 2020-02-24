/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

class Matrix {
    int r , c;
    double A[][];
    Matrix(int row , int col )
    {
        r= row;
        c= col;
        A= new double[r][c];
    }
    Scanner obj = new Scanner(System.in);
    void input()
    {
        System.out.println(" Enter the elements");
         for(int i=0;i<r;i++)
            {
                for(int j=0; j<c; j++)
                 A[i][j]= obj.nextDouble();
            }
        
    }
    
    void addition(Matrix M)
    {
        if(r==M.r || c==M.c )
                 {
                    double C[][]= new double[r][c];
                    for(int i=0 ; i<r ; i++)
                        {
                            for(int j=0; j<c; j++)
                             C[i][j]= A[i][j] + M.A[i][j];
                        }

                    System.out.println(" Resultant matrix is ");
                    // for(int a=0 ; a<r1; a++, System.out.println())
                    // {
                    //     for(int b=0; b<c1; b++)
                    //     System.out.print(C[a][b] + " ");
                    // }
                    for(double[]y : C )
                    {   
                        System.out.println();
                        for(double x : y )
                        System.out.print(x+" ");
                    }
                 }
                else
                {
                    System.out.println(" Matrices cannot be added ");
                    
                }

        }
    
    void multiply( Matrix Z)
        {
            if( c==Z.r)
            {   
                double C[][]= new double[r][Z.c];
                for(int i=0 ; i<r ; i++)
                {
                    for(int j=0 ; j<Z.c ; j++ )
                      {      double sum=0;
                           for(int k=0 ; k<c ; k++)
                           sum = sum + (A[i][k] * Z.A[ k][j]); 
  
                           C[i][j]= sum;
                        }

                }

                System.out.println(" Resultant matrix is ");
                for(int a=0 ; a<r; a++, System.out.println())
                {
                    for(int b=0; b<Z.c; b++)
                    System.out.print(C[a][b]+" ");
                }
             }
            
            else
            
                System.out.println(" Matrices cannot be multiplied ");
                
            

        }

        void rotate()
        {
            

            Matrix C= new Matrix(c,r);
            for(int i=0 ; i<c ; i++)
            {
                for(int j=0, k=r-1 ; j<r ; j++ , k--)
                   C.A[i][j]= A[k][i];
            }
          for(int i=0; i<c;i++, System.out.println())
          {
              for(int j=0; j<r; j++)
              System.out.print( C.A[i][j]+ " ");
          }


        }
            
    
}

class MatrixDemo
{
    public static void main(String args[])
    {
        int row, col; 
        Scanner obj = new Scanner(System.in);
        char ch;
        System.out.println(" Enter rows and cols for matrix 1");
        row= obj.nextInt();
        col=obj.nextInt();
        Matrix G = new Matrix(row,col);
        G.input();
        System.out.println(" Enter rows and cols for matrix 2 ");
        row= obj.nextInt();
        col=obj.nextInt();
        Matrix H = new Matrix(row,col);
        H.input();
        do
        {
            System.out.println(" Menu ");
            System.out.println(" 1. Add matrices ");
            System.out.println(" 2. Multiply Matrices ");
            System.out.println(" 3. Rotate matrices ");
            System.out.println(" Enter your choice ");
            int choice= obj.nextInt();
            switch(choice)
                {
                   
                    case 1: G.addition(H);
                            break;
                    case 2: G.multiply(H);
                            break;
                    case 3: G.rotate();
                            System.out.println();
                            H.rotate();
                           break;
                    default: System.out.println(" Enter a valid choice ");
                    
                }
                System.out.println(" Do you want to continue Y/N");
                 ch = obj.next().charAt(0);
         } while(ch== 'Y' || ch== 'y');           
        
        
        
    }
}
