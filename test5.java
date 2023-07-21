import java.io.*;
import java.util.*;
class test5
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int i,j,k;
for(i=1;i<=a;i++)
{
for(j=1;j<=a-i;j++)
{
System.out.printf(" ");
}
for(k=1;k<=(2*i-1);k++)
{
System.out.print(k);
}
System.out.println(" ");
}
}
}