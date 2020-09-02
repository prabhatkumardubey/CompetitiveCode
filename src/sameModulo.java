import java.io.*;
class sameModulo 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int h=Integer.parseInt(br.readLine());
		int arr[]=new int[h];
		int small=999999999;
		for(int i=0;i<h;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		int m=0,temp=0;
		for(int i=2;i<small;i++)
		{
			m=arr[0]%i;
			temp=0;
			for(int j=1;j<h;j++)
			{
				if(m!=(arr[j]%i))
				{
					temp=1;
					break;
				}
			}
			if(temp==0 && i!=(small-1))
			{
				System.out.print(i+" ");
			}
			else if(temp==0 && i==(small-1))
			{
				System.out.print(i+" ");
			}
		}
	}
}
