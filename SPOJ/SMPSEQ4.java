import java.io.BufferedReader;
import java.io.InputStreamReader;
//accepted in SPOJ
class SMPSEQ4 
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
			int a[]=new int[n];
			String s1=br.readLine();
			String ar1[]=s1.split(" ");
			int m=Integer.parseInt(br.readLine());
			int b[]=new int[m];
			String s2=br.readLine();
			String ar2[]=s2.split(" ");
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(ar1[i]);
			}
			for(int i=0;i<m;i++)
			{
				b[i]=Integer.parseInt(ar2[i]);
			}
			int temp=0;
			for(int i=0;i<n;i++)
			{
				for(int j=temp;j<m;j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(a[i]+" ");
						temp=j;
						break;
					}
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
