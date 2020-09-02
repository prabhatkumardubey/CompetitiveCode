import java.io.*;
public class wildcard 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String a[]=new String[t];
		String b[]=new String[t];
		int o[]=new int[t];
		int temp=0;
		for(int i=0;i<t;i++)
		{
			temp=0;
			a[i]=br.readLine();
			b[i]=br.readLine();
			if(a[i].length()==b[i].length())
			{
				for(int j=0;j<a[i].length();j++)
				{
					if(a[i].charAt(j)!=b[i].charAt(j))
					{
						if(a[i].charAt(j)=='?' || b[i].charAt(j)=='?')
						{
							continue;
						}
						else
						{
							temp=1;
							break;
						}
					}
				}
				if(temp==0)
				{
					o[i]=1;
				}
				else
				{
					o[i]=0;
				}
			}
		}
		for(int i=0;i<t;i++)
		{
			if(o[i]==0)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}
}
