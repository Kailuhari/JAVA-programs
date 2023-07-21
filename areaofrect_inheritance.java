class shape
{
public int calculatearea(int length,int breadth)
{
return length*breadth;
}
}
class areaofrect_inheritance extends shape
{
public static void main(String args[])
{
areaofrect_inheritance rectangle=new areaofrect_inheritance();
System.out.println("area"+rectangle.calculatearea(10,5));
}
}