import java.io.IOException;
import java.util.Scanner;

public class NokiaShivamShantAbsoluteDifference
{
	public static int asubset[];
	public static int bsubset[];
	public static int count=0;
	public static int flag=0;
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		sc.close();
		int size=(int) Math.pow(2, n);
		asubset=new int[size];
		count=0;
		flag=0;
		PrintSub(a);
		bsubset=new int[size];
		count=0;
		flag=1;
		PrintSub(b);
		int ct=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				int dif=asubset[i]-bsubset[j];
				if(dif<0)
				{
					dif*=(-1);
				}
				if(dif<=q)
				{
					ct++;
				}
			}
		}
		System.out.println(ct);
	}
	public static void PrintSub(int[] nums)
	{
		for(int i=0;i<=nums.length;i++)
		{
			boolean ifPrint[]=new boolean[nums.length];
			PrintSubSet(nums, ifPrint, 0 , i);
		}
	}
	public static void PrintSubSet(int[] nums, boolean[] ifPrint, int start , int remain)
	{
		if(remain==0)
		{
			int sum=0;
			for(int i=0;i<ifPrint.length;i++)
			{
				if(ifPrint[i])
				{
					sum+=nums[i];
				}
			}
			if(flag==0)
			{
				asubset[count++]=sum;
			}
			else if(flag==1)
			{
				bsubset[count++]=sum;
			}
		}
		else
		{
			if(start+remain>nums.length)
				;
			else
			{
				for(int i=start;i<nums.length;i++)
				{
					if(!ifPrint[i])
					{
						ifPrint[i]=true;
						PrintSubSet(nums, ifPrint,i+1,remain-1);
						ifPrint[i]=false;
					}
				}
			}
		}
	}
}
