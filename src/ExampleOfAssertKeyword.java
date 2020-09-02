import java.io.*;
public class ExampleOfAssertKeyword 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int p=Integer.parseInt(br.readLine());
		float i=Float.parseFloat(br.readLine());
		int y=Integer.parseInt(br.readLine());
		System.out.println(new ExampleOfAssertKeyword().computeSimpleInterest(p,i,y));
	}
	private double computeSimpleInterest(int principal, float interest, int year)
	{
		assert(principal>0) : "principal is "+principal;
		double si=(principal*interest*year)/100;
		return si;
	}
}
