import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);
sb.reverse();
String s1=sb.toString();
System.out.println(s1);
}
}