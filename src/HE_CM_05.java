import java.util.Scanner;

public class HE_CM_05 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int B[]=new int[N];
		for(int i=0;i<N;i++)
		{
			B[i]=sc.nextInt();
		}
		int prod=0,count=0;
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(j!=i)
				{
						for(int k=j+1;k<N;k++)
						{
							if(k!=j && k!=i)
							{
								prod=B[i]*B[j]*B[k];
								if(prod%K==0)
								{
									count++;
								}
							}
						}
					}
				}
			}
		System.out.println(count);
		}
}

