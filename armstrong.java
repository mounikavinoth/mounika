import java.util.*;
class armstrong
{
  public static void main(String arg[])
   {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number to check:");
         int n = sc.nextInt();
         int r,sum=0,temp = n;
         while(n>0)
          {
             r=n%10;
             n=n/10;
             sum=sum+(r*r*r);
          }
           if(sum==temp)
              System.out.print("Given number " + temp +" is Armstrong");
           else
               System.out.println("Given number " + temp +" is not Armstrong");
     }
}