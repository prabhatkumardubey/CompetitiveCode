import java.io.*;
public class SumEqualToX 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		int x=Integer.parseInt(br.readLine());
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((a[i]+a[j])==x)
				{
					temp=1;
					break;
				}
			}
			if(temp==1)
			{
				System.out.println("YES");
				break;
			}
			
		}
		if(temp==0)
		{
			System.out.println("NO");
		}
	}

}
