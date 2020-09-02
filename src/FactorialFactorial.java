import java.io.*;
import java.math.BigInteger;
public class FactorialFactorial 
{
	public static void main(String s[])throws IOException
	{
		int count=0,j,temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String x[]=new String[t];
		String y[]=new String[t];
		int o[]=new int[t];
		BigInteger fact,num,num2=BigInteger.valueOf(1);
		for(int i=0;i<t;i++)
		{
			x[i]=br.readLine();
			y[i]=br.readLine();
			j=0;
			count=0;
			num=new BigInteger("0");
			while(j<x[i].length())
			{
				if(x[i].charAt(j) == '!')
				{
					count++;
				}
				else
				{
					num=num.multiply(new BigInteger("10")).add(new BigInteger(x[i].charAt(j)+""));
				}
				j++;
			}
			String factorial=num+"";
			for(j=0;j<count;j++)
			{
				factorial=fact(factorial);
			}
			num=new BigInteger(factorial);
			
			count=0;
			num2=new BigInteger("0");
			j=0;
			while(j<y[i].length())
			{
				if(y[i].charAt(j) == '!')
				{
					count++;
				}
				else
				{
					num2=num2.multiply(new BigInteger("10")).add(new BigInteger(y[i].charAt(j)+""));
				}
				j++;
			}
			factorial=num2+"";
			for(j=0;j<count;j++)
			{
				factorial=fact(factorial);
			}
			num2=new BigInteger(factorial);
			o[i]=num.compareTo(num2);
		}
		for(int i=0;i<t;i++)
		{
			if (o[i]==-1) 
			{
				System.out.println("x<y");				
			}
			else if(o[i]==0)
			{
				System.out.println("x=y");
			}
			else
			{
				System.out.println("x>y");
			}
		}
	}
	public static String fact(String factorial)
	{
		BigInteger fact=new BigInteger("1");
		BigInteger inc=new BigInteger("1");
		BigInteger num=new BigInteger(factorial);
		BigInteger j=new BigInteger("1");
		for(;(j.compareTo(num)<=0);)
		{
			fact=fact.multiply(j);
			j=j.add(inc);
		}
		String temp=fact.toString();
		return temp;
	}
}
