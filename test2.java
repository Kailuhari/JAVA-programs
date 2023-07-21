import java.io.*;
import java.util.*;
class test2
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the integers");
int l=s.nextInt();
int r=s.nextInt();
int k=s.nextInt();
int i,count=0;
if((l!=0) && (r!=0) && (k!=0))
{
for(i=l;i<=r;i++)
{
count++;
}
int ans=count/k;
System.out.print(ans);
}
else 
{
System.out.println("invalid");
}
}
}