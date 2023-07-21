import java.io.*;
import java.util.*;
class ass1
{
public static void main(String rgs[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int count=0;
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]==4)
{
count++;
i++;
}
else
{
if(a[i]>4)
{
count++;
a[i]=a[i]-1;
}
else
{
count++;
a[i]=a[i]+1;
}
}
}
for(int i=0;i<n;i++)
{
if(a[i]==4)
{
i++;
}
else
{
if(a[i]>4)
{
count++;
a[i]=a[i]-1;
}
else
{
count++;
a[i]=a[i]+1;
}
}
}
System.out.println("The output is");
System.out.println(count);
}
}




