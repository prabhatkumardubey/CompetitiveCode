import java.util.Scanner;

public class FindDivisorsBearCryptography 
{
	public static int n,k,temp,t;
	private static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		t=sc.nextInt();
		int o[]=new int[t];
		for(int j=0;j<t;j++)
		{
			temp=0;
			n=sc.nextInt();
			k=sc.nextInt();
			for(int i=n;i>=1;i--)
			{
				if(countNumberOfDivisors(i)==k)
				{
					temp = 1;
					o[j]=i;
					break;
				}
			}
			if(temp!=1)
			{
				o[j]=-1;
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
	public static int countNumberOfDivisors(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
        {
    
            // If remainder is 0 when 'n' is divided by 'i',
            if(num%i==0)
            {
            count++;
            }
        }
		return count;
	}
}
