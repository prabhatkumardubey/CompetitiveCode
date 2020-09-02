import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//accepted in SPOJ
class SERI07 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine());
			printSeries(num);
		}
	}

	private static void printSeries(int num) {
		// TODO Auto-generated method stub
			int arr[]=getPrime(3*num);
			for(int j=0;j<3*num;j+=3)
			{
				System.out.print((arr[j]*arr[j+1])+arr[j+2]+" ");
		}
	}

	private static int[] getPrime(int count) {
		// TODO Auto-generated method stub
		int ar[]=new int[count];
		int len=count;
		for(int i=2;count>0;i++)
		{
			if(isPrime(i))
			{
				ar[len-count]=i;
				count--;
			}
		}
		return ar;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
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
