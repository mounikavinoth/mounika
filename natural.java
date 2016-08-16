import java.io.*;
import java.util.*;
class natural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers:");
int x=sc.nextInt();
int i = 1 ;
int sum = 0;
while(i <= x)
{
sum = sum +i;
i++;
}
System.out.println("Sum of "+x+" numbers is :"+sum);   
} 
}

