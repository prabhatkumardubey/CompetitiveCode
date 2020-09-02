import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CF_ER_622_01 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine());
		ArrayList<Long> ar=new ArrayList<Long>();
		long count=1;
		for(long i=0;i<n;)
		{
			for(long j=1;j<count;j++,i++)
			{
				ar.add(j);
			}
			count++;
		}
		System.out.println(ar.get((int) (n-1)));
	}
}
