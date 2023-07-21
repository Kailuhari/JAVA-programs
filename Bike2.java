import java.io.*;
import java.util.*;
abstract class employee
{   
  abstract void run(); 
}  
class employee2 extends employee
{    
  void run()
{
Scanner s=new Scanner(System.in);
System.out.println("Name");
String s1=s.nextLine();
String s2=s.nextLine();
String s3=s.nextLine();
System.out.println("Year Of Joining");
int y1=s.nextInt();
int y2=s.nextInt();
int y3=s.nextInt();
System.out.println("Address");
String a1=s.nextLine();
String a2=s.nextLine();
String a3=s.nextLine();

}    
}
class employeeDetails
{
  public static void main(String args[])
{ 
  Vehicle v=new Bike1();
  Vehicle obj = new Bike1(); 
  v.run();
  obj.run();
  }  
}