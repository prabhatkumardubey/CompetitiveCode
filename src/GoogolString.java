// google apac test
/*A "0/1 string" is a string in which every character is either 0 or 1. There are two operations that can be performed on a 0/1 string:

switch: Every 0 becomes 1 and every 1 becomes 0. For example, "100" becomes "011".
reverse: The string is reversed. For example, "100" becomes "001".
Consider this infinite sequence of 0/1 strings:

S0 = ""

S1 = "0"

S2 = "001"

S3 = "0010011"

S4 = "001001100011011"

...

SN = SN-1 + "0" + switch(reverse(SN-1)).

You need to figure out the Kth character of Sgoogol, where googol = 10100.*/
import java.io.*;
public class GoogolString 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int a[]=new int[t];
		int big=0,count=0;
		for(int i=0;i<t;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			if(big<a[i])
			{
				big=a[i];
				while(count<big)
				{
					count=count*2+1;
				}
			}
		}
		int googol[]=new int[count];
		int temp=1;
		googol[0]=0;
		while(temp<count)
		{
			googol[temp]=0;
			temp=temp*2+1;
			if(temp>count)
				break;
			for(int i=0;i<temp/2;i++)
			{
				if(googol[i]==0)
					googol[temp-1-i]=1;
				else if(googol[i]==1)
					googol[temp-1-i]=0;
			}
		}
		for(int i=0;i<t;i++)
			System.out.println("Case#"+(i+1)+": "+googol[a[i]-1]);
	}
}
