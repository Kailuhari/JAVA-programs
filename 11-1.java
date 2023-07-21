import java.io.*;
import java.util.*;
class 11
{
public static void main(String args[])
{
int a[]={16,1,2,0,4,2,7,1,2,14};
for(int i=0;i<a.length;i++)
{
if(a[i]>=2)
{
a[i]=a[i]-2;
}
else
{
a[i]=2-a[i];
}
}
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}