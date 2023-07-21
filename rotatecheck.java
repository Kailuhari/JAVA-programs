import java.io.*;
import java.util.*;
class rotation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two string");
String a=sc.nextLine();
int flag=0;
String b=sc.nextLine();
char n[]=a.toCharArray();
char m[]=b.toCharArray();
Arrays.sort(n);
Arrays.sort(m);
for(int i=0;i<n.length;i++)
{
if(n[i]==m[i])
{
flag=0;
}
else
{
flag=1;
}
}
if(flag==0)
{
System.out.println("equal");
}
else
{
System.out.println("notequal");
}
}
}
