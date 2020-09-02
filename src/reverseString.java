import java.io.*;
public class reverseString 
{
	public static void main(String... s)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String str[]=new String[t];
		for(int i=0;i<t;i++)
		{
			str[i]=br.readLine();
		}
		for(int i=0;i<t;i++)
		{
			reverse(str[i]);
			System.out.println();
		}
	}
	public static void reverse(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=(ch.length-1);i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}
