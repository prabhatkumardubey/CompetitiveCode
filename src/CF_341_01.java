import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class CF_341_01 
{
	public static long asubset[];
	public static int count=0;
	public static long sum=0;
	public static long evensum=0;
	public static BigInteger evensumsum=new BigInteger("0");
	private static Scanner sc;
	public static void main(String args[])
	{
		try{
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
		}
		asubset=new long[(int)Math.pow(2, n)];
		PrintSub(arr);
		}
		catch(Exception ex)
		{
			
		}
		System.out.println(evensumsum);
	}
	public static void PrintSub(long[] nums)
	{
		for(int i=0;i<=nums.length;i++)
		{
			boolean ifPrint[]=new boolean[nums.length];
			PrintSubSet(nums, ifPrint, 0 , i);
		}
	}
	public static void PrintSubSet(long[] nums, boolean[] ifPrint, int start , int remain)
	{
		if(remain==0)
		{
			BigInteger bigsum=new BigInteger("0");
			
			int sum=0;
			for(int i=0;i<ifPrint.length;i++)
			{
				if(ifPrint[i])
				{
					sum+=nums[i];
					bigsum=bigsum.add(BigInteger.valueOf(nums[i]));
				}
			}
				asubset[count++]=sum;
				
				if(sum%2==0)
				{
					if(evensumsum.compareTo(bigsum)==-1)
					{
						evensumsum=evensumsum.ZERO;
						evensumsum=evensumsum.add(bigsum);
					}
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
