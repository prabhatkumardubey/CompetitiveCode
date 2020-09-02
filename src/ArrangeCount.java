import java.io.*;
public class ArrangeCount 
{
	public static void main(String s[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of string");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the correct String");
		String p=br.readLine();
		System.out.println("Enter the incorrect String");
		String q=br.readLine();
		char pc[]=new char[n];
		char qc[]=new char[n];
		for(int i=0;i<n;i++)
		{
			pc[i]=p.charAt(i);
			qc[i]=q.charAt(i);
			System.out.println(pc[i]+" "+qc[i]);
		}
		int res = 0;
	    for (int i=n-1, j=n-1; i>=0; )
	    {
	        while (i>=0 && (pc[j] != qc[i]))
	        {
	            i--;
	            res++;
	            System.out.println("hi");
	        }
	        if (i >= 0)
	        {
	            i--;
	            j--;
	        }
	    }
	    System.out.println(res);
	}
}
