import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//during submission rename class Main
public class Probem272 
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int count=0;
		String strnew="",first="``",second="''";
		while(!str.isEmpty())
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='"')
				{
					if(count==0)
					{
						strnew+=first;
						count=1;
					}
					else if(count==1)
					{
						strnew+=second;
						count=0;
					}
				}
				else
				{
					strnew+=str.charAt(i);
				}
			}
			System.out.println(strnew);
			str=br.readLine();
			strnew="";
		}
		
		}catch(Exception e)
		{
			
		}
	}
}
