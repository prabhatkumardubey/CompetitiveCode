import java.io.*;
public class HE_CM_AS_02 
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
			String str=""+a[i].charAt(0);
			int index=0;
			for(int j=1;j<a[i].length();j++)
			{
				if(str.charAt(index)!=a[i].charAt(j))
				{
					str=str+a[i].charAt(j);
					index++;
				}
			}
			ra[i]=str;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(ra[i]);
		}
	}
}
