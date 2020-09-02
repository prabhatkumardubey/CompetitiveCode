import java.util.Scanner;

public class CuttingTrees 
{
	public static int N=0;
	public static int V[];
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		V=new int[N];
		for(int i=0;i<N;i++)
		{
			V[i]=sc.nextInt();
		}
		int x[]=new int[N-1];
		int y[]=new int[N-1];
		for(int i=0;i<N-1;i++)
		{
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int sumX=0,sumY=0;
		for(int i=0;i<N-1;i++)
		{
			sumX=findSumX(x,y,y[i],i);
			System.out.println(sumX);
			sumY=findSumY(x,y,x[i],i);
			System.out.println(sumY);
			System.out.println("hello "+Math.abs(sumX-sumY));
		}
	}
	public static int findSumX(int a[],int b[], int num,int index)
	{
		System.out.println(num+" hel");
		int sum=V[num-1];
		for(int i=0;i<N-1;i++)
		{
			if(num==a[i])
			{
				//System.out.println("bye "+V[a[i]-1]+" "+sum);
				sum+=findSumX(a,b,b[i],i);
			}
			else if(num==b[i] && index!=i)
			{
				sum+=findSumY(a,b,a[i],i);
			}
		}
		return sum;
		
	}
	public static int findSumY(int a[],int b[], int num,int index)
	{
		int sum=V[num-1];
		for(int i=0;i<N-1;i++)
		{
			if(num==b[i])
			{
				sum+=findSumY(a,b,a[i],i);
			}
		}
		return sum;
		
	}

}
/*
 * 6
100 200 100 500 100 600
1 2
2 3
2 5
4 5
5 6
 * */
