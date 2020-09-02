import java.io.*;
public class BucketFilling 
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int s[]=new int[t];
		int sum=0,count=0;
		for(int i=0;i<t;i++)
		{
			s[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<t;i++)
		{
			sum=0;
			count=0;
			while(sum<=s[i])
			{
				count++;
				sum=sum+count*count;
			}
			System.out.println(count-1);
		}
	}
}
