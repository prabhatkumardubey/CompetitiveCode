import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
//accepted in SPOJ
class TMUL
{
	public static int T=0,a,b;
	public static String str,starr[];
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			T=Integer.parseInt(br.readLine());
			String ar[]=new String[T];
			for(int i=0;i<T;i++)
			{
				ar[i]=br.readLine();
				
			}
			for(int i=0;i<T;i++)
			{
				str=ar[i];
				starr=str.split(" ");
				BigInteger x=new BigInteger(starr[0]);
				BigInteger y=new BigInteger(starr[1]);
				System.out.println(x.multiply(y));
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
