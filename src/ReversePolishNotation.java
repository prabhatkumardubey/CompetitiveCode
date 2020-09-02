import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePolishNotation 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		char priority[]={'+','-','*','/','^'};
		for(int i=0;i<T;i++)
		{
			String str=br.readLine();
			char ch[]=str.toCharArray();
			
		}
	}
}
