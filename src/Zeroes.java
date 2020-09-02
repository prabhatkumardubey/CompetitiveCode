import java.io.IOException;
import java.util.Scanner;

public class Zeroes 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		for(int i=0;i<n;i++)
		{
			prod*=sc.nextInt();
		}
		int q=sc.nextInt();
		int arr[]=new int[q];
		for(int i=0;i<q;i++)
		{
			arr[i]=sc.nextInt();
			int sum=0;
			int dup=prod;
			while(dup>0)
			{
				sum=sum*10+dup%arr[i];
				dup/=arr[i];
			}
			System.out.println(sum);
			dup=sum;
			int ct=0;
			while(dup>0)
			{
				if(dup%10==0)
				{
					ct++;
				}
				else
				{
					break;
				}
			}
			arr[i]=ct;
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
