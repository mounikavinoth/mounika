import java.io.*;
import java.util.*;
public class arms2
{
public static void main(String[] args) 
{
 int n, count = 0, a, b, c, sum = 0;
Scanner sc=new Scanner(System.in);
System.out.print("Armstrong range:");
int n1=sc.nextInt();
int n2=sc.nextInt();
for(int i = n1; i <= n2; i++)
{
  n = i;
  while(n > 0)
  {
   b = n % 10;
   sum = sum + (b * b * b);
   n = n / 10;
   }
   if(sum == i)
   {
    System.out.print(i+" ");
    }
   sum = 0;
  }
}
}