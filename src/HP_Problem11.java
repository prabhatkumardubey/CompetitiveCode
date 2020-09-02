import java.io.*;
public class HP_Problem11 
{
	public HP_Problem11()
	{
		System.out.println("Printing One");
		return;
	}
	public HP_Problem11(String str)
	{
		this();
		System.out.println(str);
		return;
	}
	public static void main(String args[])
	{
		HP_Problem11 samplle=new HP_Problem11("This is a test"); 
	}
}
