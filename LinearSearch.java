class LinearSearch
{
   static public void main(String args[])
      {
	int i=1,flag=0;
         int x = Integer.parseInt(args[0]);
	System.out.println(" No. to be searched is" + " "+ x);
         while(i!=args.length && flag==0)
	{
              if(Float.parseFloat(args[i])==x)
                {
                    System.out.println(" No. Found at "+" "+ (i-1));
                     flag=1;
                }
              else
                i++;
        }
             if(flag==0)
              System.out.println("NOT FOUND");
 	}
}