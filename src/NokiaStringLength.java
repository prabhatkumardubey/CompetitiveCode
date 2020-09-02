import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NokiaStringLength 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int length[]=new int[t];
		for(int i=0;i<t;i++)
		{
			String str=br.readLine();
			length[i]=str.length();
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(length[i]);
		}
	}
}
