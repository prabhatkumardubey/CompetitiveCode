import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem10550 
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			String ar[]=str.split(" ");
			int a=Integer.parseInt(ar[0]);
			int b=Integer.parseInt(ar[1]);
			int c=Integer.parseInt(ar[2]);
			int d=Integer.parseInt(ar[3]);
			while(a!=0 || b!=0 || c!=0 || d!=0)
			{
				int deg=720;//turning clockwise 2 full turns
				//now stop at first combination
				//first combination
				if(b>=a)
				{
					deg+=(9*(b-a));
				}
				else
				{
					deg+=(9*(40-a)+9*b);
				}
				deg+=360;//dialing counter-clockwise 1 full turn
				//now turn counter-clockwise till second combination
				//second combination
				if(c<=b)
				{
					deg+=(9*(b-c));
				}
				else
				{
					deg+=((9*b)+(9*(40-c)));
				}
				//now turn dial clockwise till third combination
				if(d>=c)
				{
					deg+=(9*(d-c));
				}
				else
				{
					deg+=((9*(40-c))+(9*d));
				}
				System.out.println(deg);
				str=br.readLine();
				ar=str.split(" ");
				a=Integer.parseInt(ar[0]);
				b=Integer.parseInt(ar[1]);
				c=Integer.parseInt(ar[2]);
				d=Integer.parseInt(ar[3]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
