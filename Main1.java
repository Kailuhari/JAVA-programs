import java.io.*;
import java.util.*;

class Member
{
   String  Name;
   int Age;
long Phonenumber;
String Address;
float Salary; 
}

class Manager extends Member
{
    
String specialization;
String department;
Manager(String Name,int Age,long Phonenumber,String Address,float Salary,String specialization,String department)
{
      this.Name=Name;
   this.Age=Age;
 this.Phonenumber=Age;
 this.Address=Address;
 this.Salary=Salary;
 this.specialization=specialization;
 this.department=department;
}
void print()
{
    System.out.println(Salary);
}
}

class Employee extends Member
{
    
String specialization;
String department;
Employee(String Name,int Age,long Phonenumber,String Address,float Salary,String specialization,String department)
{
      this.Name=Name;
   this.Age=Age;
 this.Phonenumber=Age;
 this.Address=Address;
 this.Salary=Salary;
 this.specialization=specialization;
 this.department=department;
}
void print()
{
    System.out.println(Salary);
}
}


public class Main1 {
    public static void main (String[] args)
    {
        Manager b=new Manager("s",20,1234556,"nkl",2000.90f,"java","cs");
        Employee a=new Employee("s",20,1234556,"nkl",3000.90f,"java","cs");
        b.print();
        a.print();
    }
}