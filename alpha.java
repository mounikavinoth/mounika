import java.io.*;
import java.util.*;
class alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character:");
char c=sc.next().charAt(0);
if(c>=65&&c<=91||c>=97&&c<=123)
{
System.out.println("alphabet");
}
else
{
System.out.println("not an alphabet");
}
}
}

