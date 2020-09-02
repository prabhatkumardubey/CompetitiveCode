import java.io.*;

public class HE_CAR_02 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String str[]=new String[T];
		int len,sum=0,count=0;
		char ch=' ';
		int o[]=new int[T];
		for(int i=0;i<T;i++)
		{
			sum=0;
			ch=' ';
			str[i]=br.readLine();
			len=str[i].length();
			count=0;
			for(int j=0;j<len;j++)
			{
				if(str[i].charAt(j)=='H')
				{
					if(ch=='H')
					{
						sum+=count;
						ch='H';
						count++;
					}
					else
					{
						count=1;
						ch='H';
						sum+=count;
						count++;
					}
				}
				else
				{
					count=0;
					ch='T';
				}
			}
			o[i]=sum;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(o[i]);
		}
	}
}
