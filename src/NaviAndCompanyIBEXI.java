import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NaviAndCompanyIBEXI 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int ct=0;
		for(int i=0;i<T;i++)
		{
			ct=0;
			int N=Integer.parseInt(br.readLine());
			int count=0;
			for(int j=0;j<N;j++)
			{
				String str=br.readLine();
				if(str.equals("New Project"))
				{
					if(count==0)
					{
						ct++;
						continue;
					}
					count--;
				}
				else
				{
					int num=Integer.parseInt(str);
					count+=num;
				}
			}
			System.out.println(ct);
		}
	}
}
