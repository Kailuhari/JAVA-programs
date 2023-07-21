import java.util.*;

class sum1
{
	void num(int a,int b)
	{
		System.out.println("num: " + a+b);
	}
	void num(int a,int b,int c)
	{
		System.out.println("num: " + (a+b+c));
	}
	sum1()
	{
		System.out.println("sum: " + a+b);
	}
	sum1()
	{
		System.out.println("sum: " + (a+b+c));
	}
}
class overloadingcons
{
	public static void main(String args[])
	{
		sum1 s=new sum1();
		s.sum1(1,2,3);
	}
}