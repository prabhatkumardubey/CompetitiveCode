
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class StringTokenizerExample {

	public static void main(String[] args) throws IOException {
	    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		int count=0;
		char ch = '&';
		char currentCh=' ';
		for(int i=0;i<S.length();i++)
		{
			currentCh=S.charAt(i);
			if(currentCh== '!')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='[')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh==',')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='?')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='.')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='\\')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='_')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='\'')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='@')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh=='+')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(currentCh==']')
			{
				ch=S.charAt(i);
				count++;
			}
			else if(S.charAt(i)==' ')
			{
				if(ch=='&')
				{
					ch=S.charAt(i);
					count++;
				}
			}
			else
			{
				ch='&';
			}
		}
		System.out.println(count);
		int start=0;
		ch='&';
		for(int i=0;i<S.length();i++)
		{
			currentCh=S.charAt(i);
			if(currentCh== '!')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='[')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh==',')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='?')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='.')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='\\')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='_')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='\'')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='@')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh=='+')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh==']')
			{
				System.out.println(S.substring(start, i));
				ch=S.charAt(i);
				start=i+1;
			}
			else if(currentCh==' ')
			{
				if(ch=='&')
				{
					ch=currentCh;
					System.out.println(S.substring(start, i));
					start=i+1;
				}
				else
				{
					start=i+1;
				}
			}
			else
			{
				ch='&';
			}
		}
	}
}