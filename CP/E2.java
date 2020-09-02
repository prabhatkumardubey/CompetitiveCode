

import java.io.*;
import java.util.Scanner;

public class E2
{
	private static Scanner sc;

	public static void main(String args[])throws IOException
	{
		sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		while(a!=0 || b!=0)
		{
			System.out.println(a+b);
			a=sc.nextInt();
			b=sc.nextInt();
		}
	}
}
