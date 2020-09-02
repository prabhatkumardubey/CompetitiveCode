import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FactorialLengthSum {
	
	public static int arr[];
	public static int count=0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	arr=new int[N];
    	for(int i=0;i<N;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	PrintSub(arr);
    	for(int i=0;i<N;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
    public static void PrintSub(int ar[])
    {
    	int size=ar.length;
    	int pow_size=(int) Math.pow(2, size);
    	for(int i=0;i<pow_size;i++)
    	{
    		for(int j=0;j<size;j++)
    		{
    			if(j<i)
    			{
    				System.out.print(ar[j]+" ");
    				i++;
    			}
    		}
    		System.out.println();
    	}
    }
}