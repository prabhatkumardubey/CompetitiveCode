import java.util.ArrayList;
import java.util.Scanner;

public class MatchingFactor 
{
	private static Scanner sc;
	public static int N,Q,K,a,b,c,d,x,y,inp,size=0;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		N=sc.nextInt();
		Q=sc.nextInt();
		K=sc.nextInt();
		int NA[]=new int[N];
		for(int i=0;i<N;i++)
		{
			NA[i]=sc.nextInt();
		}
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<Q;i++)
		{
			inp=sc.nextInt();
			if(inp==0)
			{
				x=sc.nextInt();
				y=sc.nextInt();
				NA[x-1]=y;
			}
			else if(inp==1)
			{
				if(sc.hasNextInt())
				{
					a=sc.nextInt();
				}
				if(sc.hasNextInt())
				{
					b=sc.nextInt();
				}
				if(sc.hasNextInt())
				{
					c=sc.nextInt();
				}
				if(sc.hasNextInt())
				{
					d=sc.nextInt();
				}
				int ab[]=new int[b-a+1];
				int cd[]=new int[d-c+1];
				int ct=0;
				for(int j=a;j<=b;j++,ct++)
				{
					ab[ct]=j;
				}
				ct=0;
				for(int j=c;j<=d;j++,ct++)
				{
					cd[ct]=j;
				}
				if((b-a+1)<=(d-c+1))
				{
					ct=0;
					for(int j=0;j<(b-a+1);j++)
					{
						for(int k=0;k<(d-c+1);k++)
						{
							if(ab[j]==cd[k])
							{
								ct++;
								break;
							}
						}
					}
				}
				else if((b-a+1)>(d-c+1))
				{
					ct=0;
					for(int j=0;j<(d-c+1);j++)
					{
						for(int k=0;k<(b-a+1);k++)
						{
							if(ab[k]==cd[j])
							{
								ct++;
								break;
							}
						}
					}
				}
				if(ct>=K)
				{
					al.add("Propose");
					size++;
				}
				else
				{
					al.add("Do not propose");
					size++;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(al.get(i));
		}
	}
}
