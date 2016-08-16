import java.util.*;
class prime2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,k;
System.out.println("first limit:");
int m=sc.nextInt();
System.out.println("second limit:");
int n=sc.nextInt();
for(i=m;i<n;i++) //here you can give your own range
{
  k=0;
  for(j=2;j<i;j++)
  {
   if(i%j==0)
     k++;
  }
   if(k==0)
     System.out.print("prime numbers are:");
    System.out.println(i+"   ");
}
}
}