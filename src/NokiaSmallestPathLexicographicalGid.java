import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NokiaSmallestPathLexicographicalGid 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		mostBeautifulPath(arr);
	}

	private static void mostBeautifulPath(int[][] matrix) {
		// TODO Auto-generated method stub
		int r=matrix.length;
		int c=matrix[0].length;
		int []dp=new int [r*c];
		for(int i=1;i<c;i++)
		{
			dp[id(0,i,c)]=id(0,i-1,c);
		}
		for(int i=1;i<r;i++)
		{
			dp[id(i,0,c)]=id(i-1,0,c);
		}
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				if(matrix[i-1][j]<=matrix[i][j-1])
				{
					dp[id(i,j,c)]=id(i-1,j,c);
				}
				else
				{
					dp[id(i,j,c)]=id(i,j-1,c);
				}
			}
		}
		int i=dp.length-1;
		List<Integer> rst=new ArrayList<>();
		int []start = coordinator(dp.length-1,c);
		rst.add(matrix[start[0]][start[1]]);
		while(i>0)
		{
			i=dp[i];
			int []pre=coordinator(i,c);
			rst.add(matrix[pre[0]][pre[1]]);
		}
		Collections.sort(rst);
		for(int v: rst)
		{
			System.out.print(v+" ");
		}
		System.out.println();
	}

	private static int[] coordinator(int i, int c) {
		// TODO Auto-generated method stub
		return new int[] {i/c,i%c};
	}

	private static int id(int i, int i2, int c) {
		// TODO Auto-generated method stub
		return i*c+i2;
	}
}
