import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SOS 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int len=str.length();
		int count=0;
		int temp=0;
		for(int i=0;i<len;i+=3)
		{
			if((i+4)<len)
			{
				if(str.substring(i,i+4).equals("SOS"))
				{
					continue;
				}
				else
				{
					temp=checkString(str.substring(i,i+4));
					count+=temp;
				}
			}
			else
			{
				if(str.substring(i).equals("SOS"))
				{
					continue;
				}
				else
				{
					temp=checkString(str.substring(i));
					count+=temp;
				}
			}
		}
		System.out.println(count);
	}

	private static int checkString(String substr) {
		// TODO Auto-generated method stub
		int ct=0;
		for(int i=0;i<3;i++)
		{
			if(i==0)
			{
				if(substr.charAt(i)=='S')
				{
					continue;
				}
				else
				{
					ct++;
					
				}
			}
			else if(i==1)
			{
				if(substr.charAt(i)=='O')
				{
					continue;
				}
				else
				{
					ct++;
					
				}
			}
			else if(i==2)
			{
				if(substr.charAt(i)=='S')
				{
					continue;
				}
				else
				{
					ct++;
					
				}
			}
		}
		return ct;
	}
}
