import java.io.*;
import java.util.*;
class number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer();
StringBuffer st=new StringBuffer();
StringBuffer sk=new StringBuffer();
int n1=sc.nextInt();
int r=1;
sb.append(j);
System.out.print(sb);
for(int i=1;i<n1;i++)
{
   st.append(sb);
   st=st.reverse();
    r++;
   sb.append(r);
   sk.append(sb);
   sk.append(st);
   System.out.print(" "+sk);
   st.delete(0,st.length());
   sk.delete(0,sk.length());
}   
}
}