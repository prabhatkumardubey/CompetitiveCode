import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TC_SRM_684_01 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int i=Integer.parseInt(br.readLine());
		System.out.println(count(s,i));
	}
	public static int count(String s, int k)
	{
		int sqar[]=new int[257];
		int ctar[]=new int[257];
		char charr[]=new char[257];
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			ctar[(int)(s.charAt(i))]+=1;
			charr[(int)(s.charAt(i))]=s.charAt(i);
		}
		int dup=k;
		int index=0;
		int big=ctar[0];
		while(dup>0)
		{
			big=0;
			index=0;
			for(int i=0;i<257;i++)
			{
				if(big<ctar[i])
				{
					big=ctar[i];
					index=i;
				}
			}
			for(int i=0;i<257;i++)
			{
				if(ctar[i]==big)
				{
					ctar[i]--;
					dup--;
				}
				if(dup==0)
				{
					break;
				}
			}
		}
		int sum=0;
		for(int i=0;i<257;i++)
		{
			sqar[i]=ctar[i]*ctar[i];
			sum+=sqar[i];
		}
		return sum;
		
	}
}
