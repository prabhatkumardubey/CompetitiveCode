//accepted in spoj

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GAMES 
{
	public static int T,count=0;
	public static long a,b;
	public static double avg;
	public static void main(String args[])throws Exception
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				String str=br.readLine();
				avg=Double.parseDouble(str);
				count=0;
				a=1;
				int flag=0;
				for(int j=str.length()-1;j>=0;j--)
				{
					if(str.charAt(j)=='.')
					{
						flag=1;
						break;
					}
					else
					{
						count++;
					}
				}
				for(int k = 0;k<str.length();k++)
				{
					if(str.charAt(k)!='.')
					{
						a=a*10 + (str.charAt(k)-48);
					}
				}
				b=1;
				if(flag==1)
				{
					b=(long) Math.pow(10, count);
				}
				System.out.println(b/gcd(a,b));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		} catch (Exception e){
			
		}
	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		 return (b==0?a:gcd(b,a%b));
	}
}
