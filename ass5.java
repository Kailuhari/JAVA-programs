import java.io.*;
import java.util.*;
class ass5
{
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int count=0;
System.out.println("Enter the elements");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
} 
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
i++;
j++;
count++;
}
}
}
System.out.println(count);
}
}