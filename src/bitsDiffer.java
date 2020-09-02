import java.io.*;
public class bitsDiffer 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a[][]=new int[2][t];
		for(int i=0;i<t;i++)
		{
			a[i][0]=br.read();
			a[i][1]=br.read();
		}
	}
}
