import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class RECUR1
{
	public static BigInteger two=new BigInteger("2");
	public static BigInteger five=new BigInteger("5");
	public static BigInteger four=new BigInteger("4");
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				BigInteger num=new BigInteger(br.readLine());
				System.out.println(recursiveF(num));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static BigInteger recursiveC(BigInteger num)
	{
	    //cout<<"g "<<num<<endl;
		 BigInteger sum=new BigInteger("0");
	    while(true)
	    {
	    if(num.equals(BigInteger.ONE))
	    {
	        return sum=sum.add(five);
	    }
	    else if(num.equals(BigInteger.ZERO))
	    {
	        return sum;
	    }
	    else
	    {
	        sum=sum.add(four);
	    }
	    num=num.subtract(BigInteger.ONE);
	    }
	}

	public static BigInteger recursiveF(BigInteger num)
	{
	    //cout<<"h "<<num<<endl;
	    BigInteger sum=new BigInteger("0");
	    while(true){
	    if(num.equals(BigInteger.ZERO))
	    {
	        return sum=sum.add(BigInteger.ONE);
	    }
	    else if(num.equals(BigInteger.ONE))
	    {
	        return sum=sum.add(two);
	    }
	    else
	    {
	        sum=sum.add(recursiveC(num.subtract(BigInteger.ONE)));
	    }
	    num=num.subtract(BigInteger.ONE);
	    }
	}

}
