import java.util.Scanner;

public class Flatland 
{
	private static Scanner sc;
	public static int n,m,dup=0,big=0,minL,minR;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int flag[]=new int[n];
		for(int i=0;i<m;i++)
		{
			flag[sc.nextInt()]=1;
		}
		for(int i=0;i<n;i++)
		{
			minL=1000000;
			minR=1000000;
			for(int j=i;j>=0;j--)
			{
				if(flag[j]==1)
				{
					minL=i-j;
					break;
				}
			}
			for(int j=i;j<n;j++)
			{
				if(flag[j]==1)
				{
					minR=j-i;
					break;
				}
			}
			if(minL<minR)
			{
				dup=minL;
			}
			else
			{
				dup=minR;
			}
			if(big<dup)
			{
				big=dup;
			}
		}
		System.out.println(big);
	}
}
