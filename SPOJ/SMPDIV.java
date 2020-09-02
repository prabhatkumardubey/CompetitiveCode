import java.io.BufferedReader;
import java.io.InputStreamReader;
//accepted in SPOJ
class SMPDIV 
{
	public static int n[],x[],y[],T;
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			T=Integer.parseInt(br.readLine());
			n=new int[T];
			x=new int[T];
			y=new int[T];
			for(int i=0;i<T;i++)
			{
				String s[]=(br.readLine()).split(" ");
				n[i]=Integer.parseInt(s[0]);
				x[i]=Integer.parseInt(s[1]);
				y[i]=Integer.parseInt(s[2]);
			}
			for(int i=0;i<T;i++)
			{
				for(int j=1;j<n[i];j++)
				{
					if(j%x[i]==0 && j%y[i]!=0)
					{
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
