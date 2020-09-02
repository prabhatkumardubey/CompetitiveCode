

import java.io.*;
import java.util.Scanner;

public class E3
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int a = 0,b = 0;
		while(sc.hasNext())
		{
			a=sc.nextInt();
			System.out.println(a);
			b=sc.nextInt();
			System.out.println(b);
			System.out.println(a+b);
		}
	}
}
