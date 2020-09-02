import java.io.*;

public class HE_CB_02 {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int N=0,count=0,num=0;
		int o[]=new int[T];
		for(int i=0;i<T;i++)
		{
			N=Integer.parseInt(br.readLine());
			count=0;
			for(int j=0;j<N;j++)
			{
				num=Integer.parseInt(br.readLine());
				if(isPrime(num))
					count++;
			}
			o[i]=count;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(o[i]);
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
}
