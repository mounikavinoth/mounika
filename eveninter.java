import java.io.*;
import java.util.*;
class eveninter
{
public static void main(String atgs[])
{
Scanner sc=new Scanner(System.in);
System.out.println("first limit:");
int m=sc.nextInt();
System.out.println("second limit:");
int n=sc.nextInt();
int i,j;
for (i=m; i<=n; i++)
{
  for (j=m; j<=n; j++)
  {
   if (j%2 ==0)
    System.out.print(j + " " );
   }
 System.out.println();
}
}
}