import java.util.*;
class rev
{
public static void main(String args[])
{
vow v=new vow();
Scanner sc=new Scanner(System.in);
String s=sc.next();
String y=v.rev1(s);
System.out.println(y);
System.out.println(v.fun(y));
}
}
class vow
{
String rev1(String s)
{
StringBuffer sb=new StringBuffer(s);
String x=sb.reverse().toString();
return x;
}

String fun(String s1)
{
int i=0;
StringBuffer s=new StringBuffer(s1);
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
{
s.deleteCharAt(i);
i--;
}
}
String h=s.toString(); 
return h;
}
}