import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class TheGreatKian 
{
	public static BigInteger sum1=new BigInteger("0");
	public static BigInteger sum2=new BigInteger("0");
	public static BigInteger sum3=new BigInteger("0");
	public static void main(String args[])
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			String str=br.readLine();
			String ar[]=str.split(" ");
			
			BigInteger arrr[]=new BigInteger[ar.length];
			for(int i=0;i<ar.length;i++)
			{
				arrr[i]=new BigInteger(ar[i]);
			}
			for(int i=0;i<ar.length;i+=3)
			{
				sum1=sum1.add(arrr[i]);
			}
			for(int i=1;i<ar.length;i+=3)
			{
				sum2=sum2.add(arrr[i]);
			}
			for(int i=2;i<ar.length;i+=3)
			{
				sum3=sum3.add(arrr[i]);
			}
			System.out.println(sum1+" "+sum2+" "+sum3);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
