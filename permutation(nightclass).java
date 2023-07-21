import java.io.*;
import java.util.*;
public class permutation(nightclass)
{
    void function()
    {
        Scanner s=new Scanner(System.in);
        String s4=s.nextLine();
        String s1=s.nextLine();
        String s3=s4+s4;
        if(s3.contains(s1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
	public static void main(String[] args) {
		Main ob=new Main();
		ob.function();
	}
}