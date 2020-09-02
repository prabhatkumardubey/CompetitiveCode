import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class A_Conversion_HealthifyMe 
{
	public static void main(String args[])
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			int o[]=new int[T];
			for(int i=0;i<T;i++)
			{
				String str1=br.readLine();
				String str2=br.readLine();
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
