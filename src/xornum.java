import java.io.*;
public class xornum 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a[]=new int[t];
		int o[]=new int[t];
		for(int i=0;i<t;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			for(int j=0;j<=a[i];j++)
			{
				if((j ^ (j+1))==a[i])
				{
					o[i]=j;
				}
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
