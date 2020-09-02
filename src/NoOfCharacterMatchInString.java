import java.io.*;
public class NoOfCharacterMatchInString 
{
	public static void main(String s[])throws IOException
	{
		int t,i,j,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		String A[]=new String[t];
		String B[]=new String[t];
		int o[]=new int[t];
		for(i=0;i<t;i++)
		{
			A[i]=br.readLine();
			B[i]=br.readLine();
			count=0;
			for(j=0;j<A[i].length();j++)
			{
				if(j>=B[i].length())
				{
					break;
				}
				if(A[i].charAt(j)==B[i].charAt(j))
				{
					count++;
				}
			}
			o[i]=count;
		}
		for(i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
