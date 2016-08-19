import java.io.*;
import java.util.*;
class cam
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1 =sc.next();
StringBuffer sb = new StringBuffer();
for (String s : s1.split("_")) 
{
  sb.append(Character.toUpperCase(s.charAt(0)));
  if (s.length() > 1)
  {
     sb.append(s.substring(1, s.length()).toLowerCase());
  }
}
   System.out.println(sb);
}
}
