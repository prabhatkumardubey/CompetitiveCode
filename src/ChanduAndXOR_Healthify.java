import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChanduAndXOR_Healthify 
{
	public static void main(String args[])
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		String star[]=str.split(" ");
		int N=Integer.parseInt(star[0]);
		int M=Integer.parseInt(star[1]);
		int ar[][]=new int[N][M];
		for(int i=0;i<N;i++)
		{
			str=br.readLine();
			star=str.split(" ");
			for(int j=0;j<star.length;j++)
			{
				ar[i][j]=Integer.parseInt(star[j]);
			}
		}
		int sa[]=new int[N];
		int sb[]=new int[M];
		for(int i=0;i<N;i++)
		{
			int sum=0;
			for(int j=0;j<M;j++)
			{
				sum+=ar[i][j];
			}
			sa[i]=sum;
		}
		for(int i=0;i<N;i++)
		{
			int sum=0;
			for(int j=0;j<M;j++)
			{
				sum+=ar[j][i];
			}
			sb[i]=sum;
		}
		int xor=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				if((sa[i]^sb[j])>xor)
				{
					xor=(sa[i]^sb[j]);
				}
			}
		}
		System.out.println(xor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
