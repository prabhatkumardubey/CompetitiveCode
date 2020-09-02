/*Program to find the extra character in palindrome string*/
import java.io.*;
public class checkPalindrome 
{
	public static void main(String... s)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String str[]=new String[t];
		char ch[]=new char[t];
		for(int i=0;i<t;i++)
		{
			str[i]=br.readLine();
			ch[i]=findChar(str[i]);
		}
		for(int i=0;i<t;i++)
		{
			if(ch[i]==' ')
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not Palindrome = "+ch[i]);
			}
		}
	}
	public static char findChar(String str)
	{
		char ch=' ';
		int temp=0;
		for(int i=0,j=(str.length()-1);i<(str.length());i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				continue;
			}
			else
			{
				temp=i;
				break;
			}
		}
		if(temp==0)
		{
			return ' ';
		}
		ch=str.charAt(temp);
		return ch;
	}
}
