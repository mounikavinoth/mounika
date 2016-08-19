import java.io.*;
import java.util.*;
class stringrev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
String temp = " ";
String ans = " ";
for(int i =str.length()-1;i>=0;i--)
{
 temp +=i!=0?str.charAt(i):str.charAt(i)+" ";
 if(str.charAt(i) == ' '||i==0)
 {
  for(int j=temp.length()-1;j>=0;j--)
  {
   ans+= temp.charAt(j);
  }
  temp = "";
 }
}
System.out.println(ans);
}
}