class Fact
{
    public static void main(String args[])
      {   
     int cnt=0;
         while(cnt!=args.length)
      {
           int fact=1;
          int num= Integer.parseInt(args[cnt]);
          while(num!=1)
             {
                 fact= fact* num;
                num--;
              }
     System.out.println(" Factorial is "+" "+fact);
      cnt++;
    }
  }
}
              
         