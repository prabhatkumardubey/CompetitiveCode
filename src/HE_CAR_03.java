import java.util.Scanner;

public class HE_CAR_03 
{
	private static int sum;

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N;
		int o[]=new int[T];
		for(int i=0;i<T;i++)
		{
			N=sc.nextInt();
			int A[]=new int[N];
			for(int j=0;j<N;j++)
			{
				A[j]=sc.nextInt();
			}
			int j,temp;
			for(int k=0;k<N;k++)
		    {
		        temp=A[k];
		        j=k;
		        while(j>0)
		        {
		        	if(temp<A[j-1])
		        	{
		        		A[j]=A[j-1];
		        		j--;
		        	}
		        	else
		        	{
		        		break;
		        	}
		        }
		        A[j]=temp;
		    }
			sum=0;
			for(int k=N-1;k>=0;k-=2)
			{
				sum+=(A[k]*A[k-1]);
			}
			o[i]=sum;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(o[i]);
		}
	}
}
