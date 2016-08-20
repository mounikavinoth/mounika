import java.util.*;
class duplicate
{
public static void main(String args[])
{
remove re=new remove();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String s1=sc.nextLine();
System.out.println(re.fun(s1));
}
}
class remove
{
public static String fun(String s)
{
    char[] t= s.toCharArray();
    int len=t.length; 
    for (int i=0;i<len;i++)
    {
        for (int j=i+1;j<len;j++)
        {
            if(t[i]==t[j])
            {
                int h=j;
                for(int k=j+1;k<len;k++)
                {
                    t[h]=t[k];
                    h++;
                }
                len--;
                j--;
            }
        }
    }
    return String.copyValueOf(t).substring(0,len);
}
}