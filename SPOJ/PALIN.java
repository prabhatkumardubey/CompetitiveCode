import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class PALIN 
{
	public static int T;
	public static BigInteger o[];
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		try{
		T=Integer.parseInt(br.readLine());
		o=new BigInteger[T];
		while(i<T)
		{
			BigInteger num=new BigInteger(br.readLine());
			o[i]=printPalindrome(num);
			i++;
		}
		for(i=0;i<T;i++)
		{
			System.out.println(o[i]);
		}
		}
		
		catch(NumberFormatException e)
		{
			
		}
	}

	private static BigInteger printPalindrome(BigInteger num) {
		// TODO Auto-generated method stub
		BigInteger temp=new BigInteger("0");
		BigInteger i=new BigInteger("1");
		i=i.add(num);
		for(;temp.compareTo(BigInteger.ZERO)==0;i=i.add(BigInteger.ONE))
		{
			if(checkPalindrome(i))
			{
				
				temp=i;
				break;
			}
		}
		return temp;
	}

	private static boolean checkPalindrome(BigInteger i) {
		// TODO Auto-generated method stub
		BigInteger dup=new BigInteger("0");
		dup=dup.add(i);
		if((dup.mod(BigInteger.TEN)).compareTo(BigInteger.ZERO)==0)
			return false;
		BigInteger rev=new BigInteger("0");
		while(dup.compareTo(BigInteger.ZERO)==1)
		{
			rev=(rev.multiply(BigInteger.TEN)).add(dup.mod(BigInteger.TEN));
			dup=dup.divide(BigInteger.TEN);
		}
		return rev.compareTo(i)==0?true:false;
	}
}
