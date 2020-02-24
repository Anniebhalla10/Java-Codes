import java.util.Scanner;
class BinarySearch
  {
     
      public static void main(String args[])
       {
            Scanner Sc=new Scanner(System.in);
          int l=args.length;           
          if(l>0)
           { 
              int ele=Integer.parseInt(args[0]);
              System.out.println(" No. to be searched "+ " " + ele);
	      int m,e,s,flag=0;
              e=l-1;
              s=1;
              m=e+s/2;
              while( flag==0 && s<=e)
                {
                     if(Integer.parseInt(args[m])==ele)
			              { flag=1;
                           System.out.println(" No. found at position "+m);
                          }
                     else  if(ele<Integer.parseInt(args[m]))
                         {
                            e=m-1;
                            m=s+e/2;
			}
                    else
			{
 				s=m+1;
				m=s+e/2;
			}
		}
		if(flag==0)
			System.out.println(" NOT FOUND ");
           }

	else
		{ 
            System.out.println(" Enter no. to be searched ");
		    
			int ele = Sc.nextInt();
                    System.out.println(" No. to be searched "+ " "+ ele);
                    System.out.println(" enter no. of elements in array" );
                      int n= Sc.nextInt();
		   int array[]= new int[n];
           for(int j=0;j<n;j++)
               array[j]=Sc.nextInt();
               int m,e,s,flag=0;
              e=n-1;
              s=1;
              m=e+s/2;
              while( flag==0 && s<=e)
                {
                     if(array[m]==ele)
                          {
                              flag=1;
                              System.out.println(" No. found at position "+(m+1));
                          }
                     else  if(ele<array[m])
                         {
                            e=m-1;
                            m=s+e/2;
			}
                    else
			{
 				s=m+1;
				m=s+e/2;
			}
		}
		if(flag==0)
			System.out.println(" NOT FOUND ");

        }
}      
  }
                       
			