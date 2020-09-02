
import java.util.Scanner;

public class TwoDArrays 
{
	public static int N=0,K=0;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
		N=6;
		K=3;
		countSumTricky(arr);
	}
	public static void countSumTricky(int arr[][])
	{
		int stripSum[][]=new int[6][6];
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
		int big=0;
		for(int i=0;i<N-K+1;i++)
		{
			int sum=0;
			for(int j=0;j<K;j++)
			{
				sum+=stripSum[i][j];
				if(j==K-1)
					big=(big<(sum-arr[i+1][j]-arr[i+1][j-2]))?(sum-arr[i+1][j]-arr[i+1][j-2]):big;
			}
			
			for(int j=1;j<N-K+1;j++)
			{
				sum+=(stripSum[i][j+K-1]-stripSum[i][j-1]);
				big=(big<(sum-arr[i+1][j]-arr[i+1][j+2]))?(sum-arr[i+1][j]-arr[i+1][j+2]):big;
			}
		}
		System.out.println(big);
	}
}
