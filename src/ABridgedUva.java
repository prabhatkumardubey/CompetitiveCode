import java.io.*;
public class ABridgedUva 
{
	public static void main(String s[])throws IOException
	{
		int i,j,indexi=1,indexj=1,count=0;
		double dist=0.0,temp=0.0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int x[]=new int[2*t];
		int y[]=new int[2*t];
		int check[]=new int[2*t];
		double op=0.0;
		for(i=0;i<2*t;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
			y[i]=Integer.parseInt(br.readLine());
		}
		for(i=0;i<2*t;i++)
		{
			if(check[i]==0)
			{
				dist=0.0;
				for(j=i+1;j<2*t;j++)
				{
					if(check[j]==0)
					{
						temp=Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]), 2));
						if(dist>temp)
						{
							dist=temp;
							indexi=i;
							indexj=j;
							count=1;
						}
					}
				}
				if(count==0)
				{
					for(j=i+1;j<2*t;j++)
					{
						if(check[j]==0)
						{
							temp=Math.sqrt(Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]), 2));
							check[i]=1;
							check[j]=1;
							op+=temp;
							break;
						}
					}
				}
				else
				{
					check[indexi]=1;
					check[indexj]=1;
					op+=dist;
					count=0;
				}
			}
		}
		System.out.println("Output : "+op);
	}
}
