import java.io.*;
import java.util.*;
class d_distance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ca=0,cb=0,cc=0;
char temp;
System.out.println("Enter the string");
String a=sc.nextLine();
char c[]=a.toCharArray();
for(int i=0;i<c.length;i++)
{
/*if(c[i]=='a')
{
ca++;
}
else if(c[i]=='b')
{
cb++;
}
else if(c[i]=='c')
{
cc++;
}
}*/
if(c[i]==c[i+1])
{
temp=c[i];
c[i]=c[i+2];
c[i+2]=temp;
}
}
for(int i=0;i<c.length;i++)
{
System.out.println(c[i]);
}
}
}