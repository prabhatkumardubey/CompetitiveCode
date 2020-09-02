import java.io.*;
public class GCD 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int a=0,b=0,temp=0;
		if(n1>n2)
		{
			a=n1; b=n2;
		}
		else
		{
			a=n2; b=n1;
		}
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println("GCD("+n1+","+n2+") = "+a);
	}
}
