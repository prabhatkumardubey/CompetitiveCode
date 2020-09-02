import java.io.*;
public class onebyone 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String s[]=new String[t];
		int o[]=new int[t];
		int count=0;
		for(int i=0;i<t;i++)
		{
			s[i]=br.readLine();
			char ch[]=s[i].toCharArray();
			count=0;
			for(int j=0;j<ch.length-1;)
			{
				if(ch[j]==ch[j+1] && ch[j]!=' ')
				{
					count++;
					for(int k=j;k<ch.length-1;k++)
					{
						ch[k]=ch[k+1];
					}
					ch[ch.length-1]=' ';
				}
				else
				{
					j++;
				}
			}
			o[i]=count;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
