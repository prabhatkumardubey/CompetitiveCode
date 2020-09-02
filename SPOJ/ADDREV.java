import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ADDREV 
{
	public static int T,a[],b[];
	public static void main(String args[])throws IOException, NumberFormatException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			T=Integer.parseInt(br.readLine());
			a=new int[T];
			b=new int[T];
			for(int i=0;i<T;i++)
			{
				String s[]=(br.readLine()).split(" ");
				a[i]=reverse(Integer.parseInt(s[0]));
				b[i]=reverse(Integer.parseInt(s[1]));
			}
			for(int i=0;i<T;i++)
			{
				System.out.println(reverse(a[i]+b[i]));
			}
		}
		catch(Exception e)
		{
			
		}
	}

	private static int reverse(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
}
