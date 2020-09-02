import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class FCTRL {
	public static BigInteger two=new BigInteger("2");
	public static BigInteger fiv=new BigInteger("5");
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			BigInteger[] num=new BigInteger[T];
			for(int i=0;i<T;i++)
		    {
				BigInteger nm=new BigInteger(br.readLine());
		        num[i]=nm;
				BigInteger five=new BigInteger("0");
		        BigInteger j=new BigInteger("1");
		        for(;j.equals(num[i]) || j.compareTo(num[i])==-1;j=j.add(BigInteger.ONE))
		        {
		        	//System.out.println("hello "+num+" "+j);
		            BigInteger temp=new BigInteger("0");
		            temp=temp.add(j);
		            while(temp.compareTo(BigInteger.ZERO)==1)
		            {
		                //if((temp.mod(two)).compareTo(BigInteger.ZERO)==0)
		                //{
		                	//temp=temp.divide(two);
		                //}
		                if((temp.mod(fiv)).compareTo(BigInteger.ZERO)==0)
		                {
		                    five=five.add(BigInteger.ONE);
		                    temp=temp.divide(fiv);
		                }
		                else
		                {
		                    break;
		                }
		            }
		        }
		        //System.out.println(five);
		        num[i]=five;
		    }
			for(int i=0;i<T;i++)
			{
				System.out.println(num[i]);
			}
		    
		}
		catch(Exception e)
		{
			
		}
	}
}

/*
 * import java.util.Scanner;
 
 class Problem7 {
	public static void main(String[] args) {
		int t,dev=5;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		double ar[]=new double[t];
		for(int i=0;i<t;i++)
			ar[i]=sc.nextDouble();
		int res[]=new int[t];
		for(int j=0;j<t;j++){
			while(dev<=ar[j]){
				sum=sum+Math.floor(ar[j]/dev);
				dev=dev*5;
			}
		res[j]=(int)sum;
		sum=0;
		dev=5;
		System.out.println(res[j]);
		}
	}
 
}*/

/*
 * Submit it or try once
 * import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            int result = 0;
            for (int d = 5; d <= n; d *= 5) {
                result += n / d;
            }
            System.out.println(result);
        }
    }
}
*/