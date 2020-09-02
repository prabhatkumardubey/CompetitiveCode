import java.math.BigInteger;
import java.util.Scanner;
public class LuckyNuber 
{
	private static Scanner sc;

	public static void main(String s[])
	{
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count=0;
		BigInteger num,sum,j=new BigInteger("0");
		BigInteger[] o = new BigInteger[t];
		BigInteger inc=new BigInteger("1");
		for(int i=0;i<t;i++)
		{
			num=sc.nextBigInteger();
			sum=new BigInteger("0");
			j=new BigInteger("1");
			for(;j.compareTo(num)<=0;)
			{
				count=j.bitCount();
				if(count==2)
				{
					sum=sum.add(j);
				}
				j=j.add(inc);
			}
			o[i]=sum;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
