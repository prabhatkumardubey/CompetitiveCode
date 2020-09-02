import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexStringPalindrome 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String str;
		int len=0;
		int index=-9;
		for(int i=0;i<T;i++)
		{
			index=-9;
			str=br.readLine();
			len=str.length();
			for(int j=0;j<=len/2;j++)
			{
				if(str.charAt(j)!=str.charAt(len-1-j))
				{
					index=j;
					break;
				}
			}
			if(index>-9)
			{
				System.out.println(index);
			}
			else
			{
				System.out.println(-1);
			}
		}
	}
}
