import java.io.*;
import java.util.*;
class ass3
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the r");
int r=sc.nextInt();
int c=sc.nextInt();
for(int i=1;i<=r;i++,System.out.print("\n"))
{
for(int s=1;s<i;s++)
{
System.out.print(" ");
}
for(int j=1;j<=r;j++)
{
if(i==j)
{
System.out.print(i);
}
}
}
}
}