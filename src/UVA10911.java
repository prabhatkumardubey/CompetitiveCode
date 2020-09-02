import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UVA10911 
{
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.##");
		df.setRoundingMode(RoundingMode.DOWN);
		int N=sc.nextInt();
		while(N!=0)
		{
			String name[]=new String[2*N];
			int x[]=new int[2*N];
			int y[]=new int[2*N];
			int check[]=new int[2*N];
			for(int i=0;i<2*N;i++)
			{
				name[i]=sc.next();
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			double min=1000000.0;
			int index=0;
			double sum=0.0;
			for(int i=0;i<2*N;i++)
			{
				min=1000000.0;
				if(check[i]==1)
				{
					continue;
				}
				for(int j=i+1;j<2*N;j++)
				{
					if(check[j]==1)
					{
						continue;
					}
					double temp=Math.sqrt((double)(((x[j]-x[i])*(x[j]-x[i]))+((y[j]-y[i])*(y[j]-y[i]))));
					if(min>temp)
					{
						min=temp;
						index=j;
					}
				}
				check[i]=1;
				check[index]=1;
				sum+=min;
			}
			System.out.println(Double.valueOf(df.format(sum)));
			N=sc.nextInt();
		}
	}
}
