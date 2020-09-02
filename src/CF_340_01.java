import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CF_340_01 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int arr[]={1,2,3,4,5};
		int dup=x,index=0;
		int ct=0;
		while(dup>0)
		{
			for(int i=4;i>=0;i--)
			{
				if(dup>=arr[i])
				{
					index=i;
					break;
				}
			}
			dup-=arr[index];
			ct++;
		}
		System.out.println(ct);
	}
}
