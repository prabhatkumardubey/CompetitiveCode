import java.util.Scanner;

public class AlphaPrime 
{
	public static int num1,num2,T,dup;
	private static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		T=sc.nextInt();
		int cntArray[]=new int[T];
		int count=0,cntSize=0,temp=0;
		for(int i=0;i<T;i++)
		{
			num1=sc.nextInt();
			num2=sc.nextInt();
			count=0;
			for(int j=num1;j<=num2;j++)
			{
				dup=j;
				cntSize=countSize(dup);
				//dup=reverse(dup);
				temp=0;
				int tmpct=0;
				while(dup>0)
				{
					temp=temp*10+dup%10;
					temp=reverse(temp);
					if(tmpct==(cntSize-1))
					{
						temp=j;
					}
					tmpct++;
					//System.out.println("he "+j + " = "+temp);
					if(isPrime(temp))
					{
						//System.out.println("hello");
						count++;
						break;
					}
					dup=dup/10;
				}
			}
			cntArray[i]=count;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(cntArray[i]);
		}
	}
	public static boolean isPrime(int num)
	{
		int i;
		
		if(num==1)
			return false;
		
	    if (num==2)
	        return true;

	    if (num%2==0)
	        return false;

	    for (i=3;i<=Math.sqrt(num);i++)
	        if (num%i==0)
	            return false;

	    return true;
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static int countSize(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}
}
