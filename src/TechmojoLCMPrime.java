import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TechmojoLCMPrime 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String str;
		int lcm=0;
		int o[]=new int[T];
		for(int i=0;i<T;i++)
		{
			str=br.readLine();
			String strsplit[]=str.split(" ");
			int A=Integer.parseInt(strsplit[0]);
			int B=Integer.parseInt(strsplit[1]);
			int c = A*B;      
			int d=c;      
			for(int j=1;j<=c;j++)      
			{          
				if(j%A==0 && j%B==0 && j<d)          
				d=j;         
			} 
			ArrayList<Integer> ar=new ArrayList<Integer>();
			for(int j=2;j<d;j++)
			{
				if(d%j==0)
				{
					ar.add(j);
				}
			}
			Object[] arr=ar.toArray();
			for(int j=0;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[j]==arr[k])
					{
						arr[k]=-1;
					}
				}
			}
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(isPrime((int) arr[j]))
				{
					for(int k=j+1;k<arr.length;k++)
					{
						if(arr[k]==arr[j])
						{
							arr[k]=-1;
						}
					}
					count++;
				}
			}
			o[i]=count;
		}
		for(int i=0;i<T;i++)
		{
			if(isPrime(o[i]))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}

	private static boolean isPrime(int object) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=2;i<object;i++)
		{
			if(object%i==0)
			{
				temp=1;
				break;
			}
		}
		if(temp==1)
		{
			return false;
		}
		else
		{
			if(object==1)
			{
				return false;
			}
			return true;
		}
	}
}
