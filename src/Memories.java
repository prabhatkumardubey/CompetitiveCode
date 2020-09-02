import java.io.IOException;
import java.util.Scanner;

public class Memories {
	public static int asubset[];
	public static int a[];
	public static int b[];
	public static String str[];
	public static int count=0;
	public static int flag=0;
	public static int len=0;
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		a=new int[p];
		b=new int[p];
		str=new String[p];
		len=p;
		for(int i=0;i<p;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<p;i++)
		{
			b[i]=sc.nextInt();
			str[i]=String.valueOf(a[i])+","+String.valueOf(b[i])+",";
		}
		sc.close();
		int arr[]=new int[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=i;
		}
		int size=(int) Math.pow(2, n);
		asubset=new int[size];
		count=0;
		flag=0;
		PrintSub(arr);
		System.out.println(count);
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
			String sum="";
			for(int i=0;i<ifPrint.length;i++)
			{
				if(ifPrint[i])
				{
					sum+=String.valueOf(nums[i]+",");
				}
			}
			int temp=0;
			for(int i=0;i<len;i++)
			{
				if(!sum.equals(str[i]) && !sum.equals(""))
				{
					temp=0;
					for(int j=0;j<str[i].length();j++)
					{
						for(int k=j+1;k<str[i].length();k++)
						{
							if(sum.equals(str[i].substring(j, k)))
							{
								temp=1;
								break;
							}
						}
						if(temp==1)
						{
							break;
						}
					}
					if(temp==1)
					{
						break;
					}
//					System.out.println("hell "+sum);
					count++;
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
