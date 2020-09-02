

// {{{ VimCoder 0.3.6 <-----------------------------------------------------

// vim:filetype=java:foldmethod=marker:foldmarker={{{,}}}



import static java.lang.Math.*;

import static java.math.BigInteger.*;

import static java.util.Arrays.*;

import static java.util.Collections.*;

import java.math.*;

import java.util.*;



// }}}



public class TC_SRM_640_02
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int t=0;
		int ar[]=findPositions(a,t);
	}
	public static int[] findPositions(int[] atLeast, int d)
	{
		int len=atLeast.length;
		int pos=0;
		for(int i=0;i<len;i++)
		{
			pos=atLeast[i];
			for(int j=0;j<len;j++)
			{
				if(i!=j)
				{
					if(Math.abs(atLeast[j]-pos)<d)
					{
						atLeast[j]=atLeast[j-1]+d;
					}
				}
			}
		}
		return atLeast;
	}

}



