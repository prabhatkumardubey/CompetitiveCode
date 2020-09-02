import java.util.Scanner;

public class BestolHiring 
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x[]=new int[t];
		int a[]=new int[t];
		for(int i=0;i<t;i++)
		{
			x[i]=sc.nextInt();
			int sum=0;
			for(int j=0;j<i;j++)
			{
				sum+=a[j];
			}
			a[i]=x[i]*(i+1)-(sum);
		}
		for(int i=0;i<t;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
