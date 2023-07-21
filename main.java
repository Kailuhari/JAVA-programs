import java.io.*;
import java.util.*;
class allrounder
{
void both()
{
System.out.println("I am Batsman and Bowler");
}
}
class batsman extends allrounder
{
void bat()
{
System.out.println("I am Batsman");
}
}
class bowler extends allrounder
{
void bowl()
{
System.out.println("I am Bowler");
}
}
class main
{
public static void main(String args[])
{
batsman b=new batsman();
bowler bo=new bowler();
b.bat();
bo.bowl();
b.both();
}
}

