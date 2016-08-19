import java.util.*; 
class revnum
{
   public static void main(String args[])
   {
      int n, rev= 0;
 
      System.out.println("Enter the number to reverse");
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt();
      while(n!= 0)
      {
          rev=rev*10;
          rev=rev+n%10;
          n = n/10;
      }
      System.out.println("Reverse of number is "+rev);
   }
}