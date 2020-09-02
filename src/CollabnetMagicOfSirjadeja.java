import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CollabnetMagicOfSirjadeja 
{
	public static String player[]={"Rohit","Dhawan","Kohli","Yuvraj","Raina","Dhoni","Sir Jadeja"};
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				long k=Long.parseLong(br.readLine());
				int temp=1,ct=0;
				int count=1;
				int j=0;
				while(j<7)
				{
					if(count>=k-temp+1 && count<=k)
					{
						System.out.println(player[j]);
						break;
					}
					j++;
					count+=temp;
					if(j>6)
					{
						j=0;
						temp++;
					}
				}
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
