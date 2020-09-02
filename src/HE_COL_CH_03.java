import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HE_COL_CH_03 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String str1="";
		String str2="";
		int check[]=new int[t];
		for(int i=0;i<t;i++)
		{
			str1=br.readLine();
			str1=str1.toLowerCase();
			str2=br.readLine();
			str2=str2.toLowerCase();
			for(int j=0;j<str1.length();j++)
			{
				char ch=str1.charAt(j);
				for(int k=0;k<str2.length();k++)
				{
					if(ch==str2.charAt(k))
					{
						check[i]=1;
						break;
					}
				}
				if(check[i]==1)
				{
					break;
				}
			}
		}
		for(int i=0;i<t;i++)
		{
			if(check[i]==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
