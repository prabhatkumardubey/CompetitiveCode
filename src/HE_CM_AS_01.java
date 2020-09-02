import java.io.*;
public class HE_CM_AS_01 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String a[]=new String[t];
		String ra[]=new String[t];
		for(int i=0;i<t;i++)
		{
			a[i]=br.readLine();
			String str="";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				str=str+a[i].charAt(j);
			}
			ra[i]=str;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(ra[i]);
		}
	}
}
