import java.io.*;
class Prime
{
public static void main(String args[])
{
int i=0;
int c=Integer.parseInt(args[0]);
if(c==0||c==1)
{
System.out.println("neither prime nor composite");
System.exit(0);
}
else
{
for(i=2;i<=c/2;i++)
{
if(c%i!=0)
{
 continue;
}
else 
break;
}
}
if(c/2+1==i)
 System.out.println("prime number");
else
 System.out.println("not prime number");
}
}