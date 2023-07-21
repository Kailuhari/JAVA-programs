import java.io.*;
import java.util.*;
class A
{
  void run()
{
int a=1,b=2,c;
c=a+b;
System.out.println(a);
}
}

class b extends A
{
  void display()
{

System.out.println(" the answer is correct");

}
}
class position
{
public static void main(String args[])
{
b obj=new b();
obj.run();
obj.display();
}
}

