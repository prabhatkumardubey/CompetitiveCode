import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MinimumScalarProduct 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				int n=Integer.parseInt(br.readLine());
				int X[]=new int[n];
				int Y[]=new int[n];
				String str=br.readLine();
				String str2=br.readLine();
				String split[]=str.split(" ");
				String split2[]=str2.split(" ");
				for(int j=0;j<n;j++)
				{
					X[j]=Integer.parseInt(split[j]);
					Y[j]=Integer.parseInt(split2[j]);
				}
				X=sortDescending(X);
				Y=sortAscending(Y);
				int sum=0;
				for(int j=0;j<n;j++)
				{
					sum+=(X[j]*Y[j]);
				}
				System.out.println("Case #"+(i+1)+": "+sum);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int[] sortDescending(int[] y) {
		// TODO Auto-generated method stub
		int temp=0,index=0,check=0;
		for(int i=0;i<y.length;i++)
		{
			int small=y[i];
			check=0;
			for(int j=i;j<y.length;j++)
			{
				if(small>y[j])
				{
					small=y[j];
					index=j;
					check=1;
				}
			}
			if(check==1)
			{
				temp=y[index];
				y[index]=y[i];
				y[i]=temp;
			}
		}
		return y;
	}

	private static int[] sortAscending(int[] x) {
		// TODO Auto-generated method stub
		int temp=0,index=0,check=0;
		for(int i=0;i<x.length;i++)
		{
			int big=x[i];
			check=0;
			for(int j=i;j<x.length;j++)
			{
				if(big<x[j])
				{
					big=x[j];
					index=j;
					check=1;
				}
			}
			if(check==1)
			{
				temp=x[index];
				x[index]=x[i];
				x[i]=temp;
			}
		}
		return x;
	}

}
