import java.util.*;
class powerof2
{
public static void main(String args[])
{
pow p=new pow();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n1=sc.nextInt();
System.out.println(p.ispower(n1));
}
}
class pow
{
public boolean ispower(int n)
{
 boolean b=false;
 int temp=n;
while(temp>=2)
{
 if(temp%2==0)
 {
  b=true;
 }
 else
 {
  b=false;
  break;
 }
 temp=temp/2;
}
 if(b)
 {
  System.out.println("power of 2");
 }
 else
 {
  System.out.println("not power of 2");
  }
  return b;
}
}