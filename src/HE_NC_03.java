import java.io.*;
public class HE_NC_03 
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size1=0,size2=0,count,i,j,k,l,n,sum=0;
		n=Integer.parseInt(br.readLine());
		String ns[]=new String[n];
		for(i=0;i<n;i++)
		{
			ns[i]=br.readLine();
		}
		int m=Integer.parseInt(br.readLine());
		String ms[]=new String[m];
		for(i=0;i<m;i++)
		{
			ms[i]=br.readLine();
		}
		String str1[]=new String[1000000];
		String str2[]=new String[1000000];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				count=0;
				for(k=0;k<ns[i].length();k++)
				{
					for(l=1;l<=ns[i].length()-k;l++)
					{
						str1[count++]=ns[i].substring(k, k+l);
					}
				}
				size1=count;
				count=0;
				for(k=0;k<ms[j].length();k++)
				{
					for(l=1;l<=ms[j].length()-k;l++)
					{
						str2[count++]=ms[j].substring(k, k+l);
					}
				}
				size2=count;
				count=0;
				for(k=0;k<size1;k++)
				{
					for(l=0;l<size2;l++)
					{
						if(str1[k].equals(str2[l]))
						{
							count++;
						}
					}
				}
				sum+=count;
			}
		}
		System.out.println(sum);
	}
}
