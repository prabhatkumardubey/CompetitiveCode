import java.util.Scanner;

public class CF_665_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();//number bulb
		int bm[]=new int[m];
		for(int i=1;i<=m;i++)
		{
			bm[i-1]=i;
		}
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			for(int j=0;j<x;j++)
			{
				int num=sc.nextInt();
				if(bm[num-1]!=0)
				{
					bm[num-1]=0;
				}
			}
		}
		int temp=0;
		for(int i=1;i<=m;i++)
		{
			if(bm[i-1]!=0)
			{
				temp=1;
				break;
			}
		}
		if(temp==1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}
