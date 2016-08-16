import java.io.*;
import java.util.*;
class nnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int sum = 0;
for(int i = 1;i <= n;i++)
{
sum = sum + i;
}
System.out.println("The Sum Of "+n+" Numbers are:" + sum);
}
}