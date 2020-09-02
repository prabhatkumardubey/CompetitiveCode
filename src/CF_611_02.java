import java.math.BigInteger;
import java.util.Scanner;

public class CF_611_02 
{
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger i=BigInteger.ZERO;
		i=i.add(a);
		int count=0;
		int l=0,c=0;
		for(;((i.subtract(b).intValue())<=0);i=i.add(BigInteger.ONE))
		{
			l=i.bitLength();
			c=i.bitCount();
			if((l-c)==1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
