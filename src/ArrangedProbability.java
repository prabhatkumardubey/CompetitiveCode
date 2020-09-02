import java.io.*;
public class ArrangedProbability 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int b[]=new int[t];
		int o[]=new int[t];
		int p=0,q=0,d=0,temp=0,x=0,count=0;
		for(int i=0;i<t;i++)
		{
			p=Integer.parseInt(br.readLine());
			q=Integer.parseInt(br.readLine());
			d=Integer.parseInt(br.readLine());
			count=0;
			for(int j=d+1;j<1000000000;j++)
			{
				temp=(j*(j-1));
				x=p*temp;
				if(x%q==0)
				{
					b[i]=findx(x/q);
					if(b[i]==-1)
					{
						continue;
					}
					else
					{
						o[i]=j;
						count=1;
						break;
					}
				}
			}
			if(count==0)
			{
				b[i]=0;
			}
		}
		for(int i=0;i<t;i++)
		{
			if(b[i]==0)
			{
				System.out.println("No Solution");
			}
			else
			{
				System.out.println(b[i]+" "+o[i]);
			}
		}
	}
	public static int findx(int num)
	{
		int x=-1;
		for(int i=num;i>1;i--)
		{
			if(i*(i-1)==num)
			{
				x=i;
				break;
			}
		}
		return x;
	}
}
