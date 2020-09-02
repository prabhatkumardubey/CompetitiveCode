import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HE_CM_04
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		char ch='_';
		for(int i=0;i<S.length()-1;i++)
		{
			if(S.charAt(i)==ch)
			{
				char change=Character.toUpperCase(S.charAt(i+1));
				S=S.substring(0,i+1)+change+S.substring(i+2);
			}
			if(i==0)
			{
				char change=Character.toUpperCase(S.charAt(i));
				S=change+S.substring(i+1);
			}
		}
		System.out.println(S);
	}

}
