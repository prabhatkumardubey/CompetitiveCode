import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TCO_16_01 
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			System.out.println(numberOfSteps(n));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int numberOfSteps(int n)
	{
		ArrayList ar=new ArrayList();
		ar.add(n);
		int count=1;
		int nPrime=0;
		while(!(nPrime==0 && count==n))
		{
			if(isPrime((int) ar.get(ar.size()-1)))
			{
				nPrime++;
				//count++;
				return count;
			}
			else if((int) ar.get(ar.size()-1)==1)
			{
				if(nPrime==0)
				{
					return -1;
				}
				return count;
			}
			else
			{
				int num=(int) ar.get(ar.size()-1);
				int dup=num;
				int sum=0;
				while(dup>0)
				{
					sum+=(dup%10)*(dup%10);
					dup/=10;
				}
				ar.add(sum);
				count++;
			}
		}
		if(count>1)
		{
			return count;
		}
		return -1;
		
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
}
