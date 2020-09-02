import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralMatrix1 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int prod=N*N;
		int A[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			String str=br.readLine();
			String split[]=str.split(" ");
			for(int j=0;j<N;j++)
			{
				A[i][j]=Integer.parseInt(split[j]);
			}
		}
			int L=0,R=0,U=0,D=0,i=0,j=0,temp=0;
			for(int k=1;k<=prod;)
			{
				i=0+L;
				for(j=0+U;j<N-D;j++)
				{
					System.out.print(A[i][j]+" ");
					k++;
					if(k>prod)
					{
						temp=1;
						break;
					}
				}
				if(temp==1)
				{
					break;
				}
				L++;
				j=N-D-1;
				for(i=0+L;i<N-R-1;i++)
				{
					System.out.print(A[i][j]+" ");
					k++;
					if(k>prod)
					{
						temp=1;
						break;
					}
				}
				if(temp==1)
				{
					break;
				}
				D++;
				i=N-R-1;
				for(;j>=0+U;j--)
				{
					System.out.print(A[i][j]+" ");
					k++;
					if(k>prod)
					{
						temp=1;
						break;
					}
				}
				if(temp==1)
				{
					break;
				}
				R++;
				j=0+U;
				for(i=N-R-1;i>=0+L;i--)
				{
					System.out.print(A[i][j]+" ");
					k++;
					if(k>prod)
					{
						temp=1;
						break;
					}
				}
				if(temp==1)
				{
					break;
				}
				U++;
		}
	}
}
