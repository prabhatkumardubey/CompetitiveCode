import java.util.Scanner;

public class CF_334_02 
{
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int [n];
		int s = 0;
		int count=n-k;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(s<arr[i])
			{
				s=arr[i];
			}
		}
		for(int i=0;i<count;i++)
		{
			if(s<(arr[i] + arr[2*count - 1 - i]))
			{
				s= arr[i] + arr[2*count - 1 - i];
			}
		}
		System.out.println(s);
	}
}
