import java.util.Scanner;

public class HE_CAR_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		String str[]=new String[T];
		int N,P,num,sum;
		for(int i=0;i<T;i++)
		{
			N=sc.nextInt();
			P=sc.nextInt();
			sum=0;
			for(int j=0;j<N;j++)
			{
				num=sc.nextInt();
				sum+=num;
			}
			if(sum/N>=P)
			{
				str[i]="Yes";
			}
			else
			{
				str[i]="No";
			}
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(str[i]);
		}
	}

}
