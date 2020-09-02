import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * 
 * For Given a set X with N distinct elements, 
 * in how many ways can you select two sets A and B such that 
 * both A and B are subsets of X and A is also a subset of B.
 solve the above problem. As the answer can be very large, print it modulo 109+7.
 */
public class HE_CAR_04 
{
	private static int num;
	public static BigInteger modulo=new BigInteger("1000000007");
	public static BigInteger solve=new BigInteger("3");
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		int o[]=new int[t];
		for(int i=0;i<t;i++)
		{
			num=Integer.parseInt(br.readLine());
			solve=new BigInteger("3");
			solve=solve.pow(num);
			solve=solve.mod(modulo);
			System.out.println(solve);
		}
	}
}
