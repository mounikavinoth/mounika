import java.io.*;
import java.util.*;
class alpreverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int i=0,j=0,l=0,f=0;
char t=' ';
String a[]=s1.split(" ");
for(i=0;i<a.length;i++)
{
 char d[]=a[i].toCharArray();
 for(j=0;j<d.length;j++)
 {
  for(l=j+1;l<d.length;l++)
  {
   if((d[j]>=65&&d[j]<=91)||(d[j]>=97&&d[j]<=123)||(d[l]>=65&&d[l]<=91)||(d[l]>=97&&d[l]<=123))
   {
    if(d[j]>d[l])
    {
    t=d[j];
    d[j]=d[l];
    d[l]=t;
    }
   }
   else if(d[j]>=48&&d[j]<=56)
     continue;
  }
 }
 for(f=0;f<d.length;f++)
 {
  System.out.print(d[f]);
 }
 System.out.print(" ");
}
}
}
 
