import java.io.*;
public class LargeNonMersennePrime 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int o[]=new int[t];
		int a=0,b=0,c=0,d=0,prod=0;
		for(int i=0;i<t;i++)
		{
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			c=Integer.parseInt(br.readLine());
			d=Integer.parseInt(br.readLine());
			prod=1;
			for(int j=0;j<c;j++)
			{
				prod=prod*b;
			}
			o[i]=(a*prod)+d;
		}
		int count=0;
		for(int i=0;i<t;i++)
		{
			count=0;
			prod=o[i];
			while(prod>0)
			{
				count++;
				prod=prod/10;
			}
			for(int j=0;j<(12-count);j++)
			{
				System.out.print(0);
			}
			System.out.println(o[i]);
		}
	}
}
