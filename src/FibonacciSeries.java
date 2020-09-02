import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FibonacciSeries 
{
	public static int a=0,b=1;
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			series(n);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void series(int n)
	{
		if(a<=n && b<=n)
		{
			System.out.print(a+" ");
			a=a+b;
			System.out.print(b+" ");
			b=a+b;
			series(n);
		}
		else
		{
			return;
		}
			
		
		
	}
}
