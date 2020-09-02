import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CF_342_01 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger M=new BigInteger(br.readLine());
		BigInteger P=new BigInteger(br.readLine());
		BigInteger G=new BigInteger(br.readLine());
		BigInteger R=new BigInteger(br.readLine());
		BigInteger count=new BigInteger("0");
		BigInteger dup=new BigInteger("0");
		dup=M;
		BigInteger ret=new BigInteger("0");
		while(M.compareTo(G)==1 || M.compareTo(G)==0)
		{
			count=count.add(M.divide(G));
			ret=ret.add((M.divide(G)).multiply(R));
			M=M.mod(G);
			M=M.add(ret);
			ret=BigInteger.ZERO;
		}
		count=count.add(M.divide(P));
		if((dup.divide(P)).compareTo(count)==1)
		{
			count=dup.divide(P);
		}
		System.out.println(count);
	}
}
