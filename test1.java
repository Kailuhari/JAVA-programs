import java.io.*;
import java.util.*;
class test1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String S="12A346-67";
char first=S.charAt(0);
char second=S.charAt(1);
char third=S.charAt(2);
char fourth=S.charAt(3);
char fifth=S.charAt(4);
char sixth=S.charAt(5);
char seventh=S.charAt(6);
char eighth=S.charAt(7);
char nineth=S.charAt(8);
int i=first;
while(i<=nineth)
{
if((i!='A')&&(i!='E')&&(i!='I')&&(i!='O')&&(i!='U')&&(i!='Y'))
{
System.out.println("invalid");
break;
}
else
{
System.out.println("valid");
}
i++;
}
}
}