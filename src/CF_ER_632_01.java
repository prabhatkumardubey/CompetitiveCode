import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF_ER_632_01 
{
	public static BigInteger five=new BigInteger("5");
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger amt=new BigInteger("0");
		String str=br.readLine();
		String strar[]=str.split(" ");
		int n=Integer.parseInt(strar[0]);
		int price=Integer.parseInt(strar[1]);
		strar=new String[n];
		double num=n;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			strar[i]=br.readLine();
			if(strar[i].equals("half"))
			{
				temp=(int) (num/2);
				num=(double)num/2;
				System.out.println("temp1 = "+temp+" num= "+num);
				for(int j=0;j<temp;j++)
				{
					amt=amt.add(BigInteger.TEN);
				}
			}
			else if(strar[i].equals("halfplus"))
			{
				temp=(int) (num/2);
				num=(double)num/2;
				System.out.println("temp = "+temp+" num= "+num);
				for(int j=0;j<temp;j++)
				{
					amt=amt.add(BigInteger.TEN);
				}
				amt=amt.add(five);
			}
		}
		System.out.println(amt);
	}
}
