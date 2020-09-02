import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phonebook 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
	    int ph_no[]=new int[N];
		String nam[]=new String[N];
	    for(int i=0;i<N;i++)
	    {
	    	nam[i]=br.readLine();
	        ph_no[i]=Integer.parseInt(br.readLine());
	     }
	     int temp=0;
	     String str=br.readLine();
	     while(!str.equals(""))
	      {
	          temp=0;
	          for(int i=0;i<N;i++)
				{
					if(nam[i].equals(str))
					{
						System.out.println(str+"="+ph_no[i]);
						temp=1;
						break;
					}
				}
				if(temp==0)
				{
					System.out.println("Not found");
				}
				str=br.readLine();
	      }	
	}
}
