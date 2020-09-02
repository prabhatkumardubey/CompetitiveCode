import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringCheck 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String A[]=new String[24];
		String B[]=new String[24];
		int O[]=new int[24];
		for(int i=0;i<24;i++)
		{
			String str=br.readLine();
			A[i]=str.substring(0,11);
			B[i]=str.substring(11);
			if(checkSubstring(A[i],B[i]))
			{
				O[i]=1;
			}
			else
			{
				O[i]=0;
			}
		}
		for(int i=0;i<24;i++)
		{
			System.out.println(O[i]);
		}
	}
	public static boolean checkSubstring(String a, String b)
	{
		int lenA=a.length();
		int lenB=b.length();
		for(int i=0;i<lenA-lenB;i++)
		{
			if(a.substring(i, i+lenB).equals(b))
			{
				return true;
			}
		}
		return false;
	}
}
