class Factorial
{
    public static void main(String args[])
      {
         int fact=1;
          int num= Integer.parseInt(args[0]);
          while(num!=1)
             {
                 fact= fact* num;
                num--;
              }
     System.out.println(" Factorial is "+" "+fact);
}
}
              
         