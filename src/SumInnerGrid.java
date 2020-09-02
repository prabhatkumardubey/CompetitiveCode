import java.util.*;

public class SumInnerGrid 
{
	public static int N=0,K=0;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		countSumTricky(arr);
	}
	public static void countSumTricky(int arr[][])
	{
		if(K>N)
			return;
		int stripSum[][]=new int[N][N];
		for(int j=0;j<N;j++)
		{
			int sum=0;
			for(int i=0;i<K;i++)
			{
				sum+=arr[i][j];
				stripSum[0][j]=sum;
			}
			
			for(int i=1;i<(N-K+1);i++)
			{
				sum+=(arr[i+K-1][j]-arr[i-1][j]);
				stripSum[i][j]=sum;
			}
		}
		int count=0;
		double cube;
		for(int i=0;i<N-K+1;i++)
		{
			int sum=0;
			for(int j=0;j<K;j++)
			{
				sum+=stripSum[i][j];
			}
			cube=Math.cbrt(sum);
			if((int)(cube*cube*cube)==sum)
			{
				count++;
			}
			
			for(int j=1;j<N-K+1;j++)
			{
				sum+=(stripSum[i][j+K-1]-stripSum[i][j-1]);
			}
			cube=Math.cbrt(sum);
			if((int)(cube*cube*cube)==sum)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
