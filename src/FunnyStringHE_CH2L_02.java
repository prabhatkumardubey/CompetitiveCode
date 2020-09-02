
import java.io.*;
public class FunnyStringHE_CH2L_02 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String as[]=new String[t];
		int o[]=new int[t];
		int len,a,b,temp;
		String rev="";
		for(int i=0;i<t;i++)
		{
			as[i]=br.readLine();
			len=as[i].length();
			for(int j=len-1;j>=0;j--)
			{
				rev+=as[i].charAt(j);
			}
			temp=0;
			for(int j=1;j<len;j++)
			{
				a=Math.abs(as[i].charAt(j)-as[i].charAt(j-1));
				b=Math.abs(rev.charAt(j)-rev.charAt(j-1));
				if(a!=b)
				{
					temp=1;
					break;
				}
			}
			o[i]=temp;
		}
		for(int i=0;i<t;i++)
		{
			if(o[i]==0)
			{
				System.out.println("Funny");
			}
			else
			{
				System.out.println("Not Funny");
			}
		}
	}
}
