

import java.io.*;
import java.util.Scanner;

public class E1 
{
	private static Scanner sc;

	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		sc = new Scanner(System.in);
		int TC=Integer.parseInt(br.readLine());
		int a,b;
		for(int i=0;i<TC;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+b);
		}
	}
}
