import java.io.*;
public class SwappingBridge 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int o[]=new int[t];
		int l=0,first=0,temp=0,index=0;
		for(int i=0;i<t;i++)
		{
			int a[]=new int[l=Integer.parseInt(br.readLine())];
			int b[]=new int[l];
			for(int j=0;j<l;j++)
			{
				a[j]=Integer.parseInt(br.readLine());
				b[j]=0;
			}
			first=a[0];
			temp=a[0];
			index=0;
			do
			{
				index=temp;
				temp=a[index-1];
				b[index-1]=1;
			}while(temp!=first);
			temp=0;
			for(int j=0;j<l;j++)
			{
				if(b[j]==0)
				{
					temp++;
				}
			}
			o[i]=temp;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
