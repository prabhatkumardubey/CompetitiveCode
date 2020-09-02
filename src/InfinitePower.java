import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InfinitePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int x=0;x<T;x++)
			{
				int N=Integer.parseInt(br.readLine());
				if(checkEven(N))
				{
					System.out.println("Unlimited Power");
					continue;
				}
				else
				{
					int i=0;
					for(i=N+1;!checkEven(i);i++);
					int big=i;
					i=0;
					for(i=N-1;!checkEven(i);i--);
					int small=i;
					int difUp=big-N;
					int difDown=N-small;
					for(int j=1;j<=difUp && j<=difDown;j++)
					{
						if(difUp%j==0 && difDown%j==0)
						{
							difUp=difUp/j;
							difDown=difDown/j;
						}
					}
					System.out.println(difUp+"/"+difDown);
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

	private static boolean checkEven(int n) {
		// TODO Auto-generated method stub
		int dup=n;
		int ct=0;
		while(dup>0)
		{
			int temp=dup%10;
			if(temp==0)
			{
				
			}
			else
			{
				if(temp%2==0)
				{
					
				}
				else
				{
					ct++;
				}
			}
			dup/=10;
		}
		if(ct==0)
		{
			return true;
		}
		return false;
	}

}
