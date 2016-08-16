import java.io.*;
import java.util.*;
class greater
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if(n1>n2&&n1>n3)
{
System.out.println("greater is n1:"+n1);
}
else if(n2>n3)
{
System.out.println("greater is n2:"+n2);
}
else
{
System.out.println("greater is n3:"+n3);
}
}
}