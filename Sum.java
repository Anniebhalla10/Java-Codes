class Sum
{
   public static void main(String args[])
   {     
        int i=0;
float sum=0;
        while(i!=args.length)
         {
            sum= sum + Float.parseFloat(args[i]);
              i++;
         }
    System.out.println(sum);

   }
}