import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RoundHouse 
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str[]=(br.readLine()).split(" ");
			int n=Integer.parseInt(str[0]);
			int a=Integer.parseInt(str[1]);
			int b=Integer.parseInt(str[2]);
			int dup=b;
			while(dup!=0)
			{
				if(dup<0)
				{
					dup++;
					a--;
					if(a<1)
					{
						a=n;
					}
				}
				else if(dup>0)
				{
					dup--;
					a++;
					if(a>n)
					{
						a=1;
					}
				}
			}
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
