

//{{{ VimCoder 0.3.6 <-----------------------------------------------------

//vim:filetype=java:foldmethod=marker:foldmarker={{{,}}}



import static java.lang.Math.*;

import static java.math.BigInteger.*;

import static java.util.Arrays.*;

import static java.util.Collections.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

import java.util.*;



//}}}



public class TC_SRM_640

{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		System.out.println(bigDistance(s));
	}

	public static int bigDistance(String s)
	{
		int len=s.length();
		int dif=0;
		for(int i=0;i<len;i++)
		{
			char ch=s.charAt(i);
			for(int j=len-1;j>=i;j--)
			{
				if(ch!=s.charAt(j))
				{
					if(dif<(j-i))
					{
						dif=(j-i);
					}
				}
			}
		}
		return dif;
		
	}

}



