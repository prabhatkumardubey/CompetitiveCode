import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Divisor summation time limit exceeded
class DIVSUM 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			int a[]=new int[t];
			for(int i=0;i<t;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
				a[i]=sumDivisor(a[i]);
			}
			for(int i=0;i<t;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			
		}
	}

	private static int sumDivisor(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				//System.out.println(i);
				sum+=i;
			}
		}
		return sum;
	}
}
