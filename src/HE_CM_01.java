import java.io.*;

public class HE_CM_01 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		String str="<3";
		int count=0;
		for(int i=0;i<S.length()-1;i++)
		{
			if(S.substring(i, i+2).equals(str))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
