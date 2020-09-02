import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PRIME1 
{
	//sieve of atkin prime algorithm
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//long n,m, limit;
		BigInteger n=new BigInteger("0");
		BigInteger m=new BigInteger("0");
		
	    //n=sc.nextBigInteger();
	    m=sc.nextBigInteger();
	    //limit=m-n;
	    SieveOfAtkin(n,m);
	}	
	public static void SieveOfAtkin(BigInteger limit1,BigInteger limit2)
	{
		//long  n=limit1;
		//long  m=limit2;
		//long limit=m-n2;
		int l=(limit2.subtract(limit1)).intValue();
		BigInteger two=new BigInteger("2");
		BigInteger three=new BigInteger("3");
		BigInteger limit=new BigInteger(l+"");	
		if(limit.compareTo(two)==1) System.out.print(2+" ");
		if(limit.compareTo(three)==1) System.out.print(3+" ");
		
		boolean sieve[]=new boolean[limit.intValue()];
		
		BigInteger i=new BigInteger("0");
		for(;i.compareTo(limit)==-1;i=i.add(BigInteger.ONE))
			sieve[i.intValue()]=false;
		
		BigInteger x=new BigInteger("1");
		for(;(x.multiply(x)).compareTo(limit)==-1;x=x.add(BigInteger.ONE))
		{
			BigInteger y=new BigInteger("1");
			for(;(y.multiply(y)).compareTo(limit)==-1;y=y.add(BigInteger.ONE))
			{
				BigInteger four=new BigInteger("4");
				BigInteger n=new BigInteger("0");
				n=n.add(((x.multiply(x).multiply(four)).add(y.multiply(y))));
				BigInteger twelve=new BigInteger("12");
				if((n.compareTo(limit)==-1 || n.compareTo(limit)==0) && (n.mod(twelve)).equals(1) || (n.mod(twelve)).equals(5))
					sieve[n.intValue()] ^=true;

				
				n=n.add(((x.multiply(x).multiply(three)).add(y.multiply(y))));
				//n=(3*x*x)+(y*y);

				if((n.compareTo(limit)==-1 || n.compareTo(limit)==0) && (n.mod(twelve)).equals(7))
					sieve[n.intValue()] ^=true;

				n=n.add(((x.multiply(x).multiply(three)).subtract(y.multiply(y))));
				if(x.compareTo(y)==1 &&  (n.compareTo(limit)==-1 || n.compareTo(limit)==0) && (n.mod(twelve)).equals(11))
					sieve[n.intValue()] ^=true;
			}
		}

		BigInteger r=new BigInteger("5");
		for(;(r.multiply(r)).compareTo(limit)==-1;r=r.add(BigInteger.ONE))
		{
			if(sieve[r.intValue()])
			{
				i=new BigInteger("0");
				i=i.add(r.multiply(r));
				for(;i.compareTo(limit)==-1;i=i.add(r.multiply(r)))
				{
					sieve[i.intValue()]=false;
				}
			}
		}
		BigInteger a=new BigInteger("5");
		System.out.println(limit + " "+a.intValue());
		for(;a.compareTo(limit)==-1;a=a.add(BigInteger.ONE))
		{
			
			if(sieve[a.intValue()]){
				System.out.print(a+" ");
				System.out.println("sdjbc");
			}
		}
	}
}
