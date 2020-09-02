import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//during submission rename class Main

class Problem1124 
{
	public static void main(String args[])throws IOException
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			while(!str.isEmpty())
			{
				System.out.println(str);
				str=br.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
}
