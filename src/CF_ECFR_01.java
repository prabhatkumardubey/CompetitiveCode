import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF_ECFR_01 
{

	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger a=new BigInteger(br.readLine());
		BigInteger b=new BigInteger(br.readLine());
		int res = a.compareTo(b);
		if(res==-1)
		{
			System.out.println("<");
		}
		else if(res==1)
		{
			System.out.println(">");
		}
		else if(res ==0)
		{
			System.out.println("=");
		}
	}
}
