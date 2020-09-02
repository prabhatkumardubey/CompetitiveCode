import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tchmojo_SimpleRankPredictor 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String str=br.readLine();
		String s[]=str.split(" ");
		int N=Integer.parseInt(s[0]);
		int K=Integer.parseInt(s[1]);
		int Y=Integer.parseInt(s[2]);
		if(Y+1>N-K)
		{
			System.out.println(N-K);
		}
		else
		{
			System.out.println(Y+1);
		}
	}
}
