import java.io.*;
public class RelativePrimeOrCoPrime 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		num1=Integer.parseInt(br.readLine());
		num2=Integer.parseInt(br.readLine());
		int arr1[]=new int[num1/2];
		int ct1=0,temp=0,temp1=0,temp2=0;
		for(int i=2;i<num1/2;i++)
		{
			if(num1%i==0)
			{
				arr1[ct1]=i;
				ct1++;
				temp1++;
			}
		}
		for(int i=2;i<num2/2;i++)
		{
			if(num2%i==0)
			{
				temp2++;
				for(int j=0;j<ct1;j++)
				{
					if(i==arr1[j])
					{
						temp=1;
						break;
					}
				}
			}
			if(temp==1)
			{
				System.out.println("Not a Co-Prime or Relative Prime");
				break;
			}
		}
		if(temp1==0 || temp2==0)
		{
			System.out.println("Not a Co-Prime or Relative Prime");
		}
		else
		{
			if(temp==0)
			{
				System.out.println("Co-Prime or Relative Prime");
			}
		}
	}
}
