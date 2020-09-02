import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortingExample {
	public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j,temp;
		for(int i=0;i<N;i++)
	    {
	        temp=arr[i];
	        j=i;
	        while(j>0)
	        {
	        	if(temp<arr[j-1])
	        	{
	        		arr[j]=arr[j-1];
	        		j--;
	        	}
	        	else
	        	{
	        		break;
	        	}
	        }
	        arr[j]=temp;
	    }
		int absDif[]=new int[N-1];
		int min=10000001;
		for(int i=0;i<N-1;i++)
		{
			absDif[i]=arr[i+1]-arr[i];
			min=min>absDif[i]?absDif[i]:min;
		}
		for(int i=0;i<N-1;i++)
		{
			if(absDif[i]==min)
			{
				System.out.print(arr[i]+" "+arr[i+1]+" ");
			}
		}
    }
}
