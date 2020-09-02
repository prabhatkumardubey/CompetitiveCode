import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class PrimeExample {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int ar[]=new int[T];
		for(int i=0;i<T;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<T;i++)
		{
			if(isPrime(ar[i]))
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		int i;
		
		if(num==1)
			return false;
		
	    if (num==2)
	        return true;

	    if (num%2==0)
	        return false;

	    for (i=3;i<=Math.sqrt(num);i++)
	        if (num%i==0)
	            return false;

	    return true;
	}
}
