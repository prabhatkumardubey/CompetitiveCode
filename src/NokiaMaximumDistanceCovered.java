import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class NokiaMaximumDistanceCovered 
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		sc.close();
		double[] fuel= new double[n];
		double big=0.0;
		for(int i=0;i<n;i++)
		{
			fuel[i]=((double)f/(double)c[i]);
			fuel[i]=fuel[i]*(double)s[i];
			if(big<fuel[i])
			{
				big=fuel[i];
			}
		}
		DecimalFormat df=new DecimalFormat("0.###");
		df.setRoundingMode(RoundingMode.DOWN);
		//String str=String.format("%.5f",big);
		System.out.println(Double.valueOf(df.format(big)));//used formatter for upto three decimal places
	}
	
}
