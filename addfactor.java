import java.io.*;
import java.util.*;
class factor
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();
int i,sum=0;
for(i=1;i<=a;i++)
{
if((a%i)==0)
{
sum=sum+i;
}
}
System.out.printf("%d",sum);
}
}