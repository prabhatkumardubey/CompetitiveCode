import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prime 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int k=0;k<T;k++)
		{
			System.out.println("helsx");
			String str=br.readLine();
			String mn[]=str.split(" ");
			BigInteger m=new BigInteger(mn[0]);
			BigInteger n=new BigInteger(mn[1]);
			BigInteger arr[]=new BigInteger[n.intValue()];
			BigInteger i=new BigInteger("2");
			BigInteger sqrtn=new BigInteger("0");
			BigInteger u=new BigInteger("0");
			BigInteger j=new BigInteger("0");
			for(;((u.multiply(u)).compareTo(n.divide(i)))==-1;)
			{
				u=u.add(BigInteger.ONE);
				System.out.println("nfn");
				//u=u.add(BigInteger.ONE);
			}
			sqrtn=u;
			u=new BigInteger("0");
			System.out.println(sqrtn+" sbd");
			if(m.equals(BigInteger.ONE))
			{
				arr[0]=BigInteger.ONE;
				System.out.println(arr[0]+" gjhvjh");
			}
			for(;i.compareTo(sqrtn)==-1 || i.compareTo(sqrtn)==0 ;i=i.add(BigInteger.ONE))
			{
				u=u.add((m.divide(i)).multiply(i));
				if((m.mod(i)).equals(BigInteger.ZERO))
				{
					j=new BigInteger("0");
					j=j.add(u);
				}
				else
				{
					j=new BigInteger("0");
					j=j.add(u);
					j=j.add(i);
				}
				for(;j.compareTo(n)==-1 || j.compareTo(n)==0;j=j.add(i))
				{
					if(j.compareTo(i)!=0)
					{
						System.out.println(j+" hj "+m);
						arr[(j.subtract(m)).intValue()]=BigInteger.ONE;
					}
				}
			}
			System.out.println("gjgj");
			for(i=m;i.compareTo(n)==-1 && i.compareTo(n)==0;i=i.add(BigInteger.ONE))
			{
				System.out.println("hkjhjh");
				if(arr[(i.subtract(m)).intValue()].equals(BigInteger.ZERO))
				{
					System.out.println(i);
				}
			}
		}
	}
}
