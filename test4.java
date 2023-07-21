import java.io.*;
import java.util.*;
class test4
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int n=s.nextInt();
int ans,i;
for(i=0;i<=n;i++)
{
ans=a+((2*i)*b);
System.out.println(ans);
}
}
}