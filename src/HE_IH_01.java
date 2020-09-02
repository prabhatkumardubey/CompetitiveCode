import java.util.Scanner;

public class HE_IH_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int o[]=new int[t];
		String inp="",temp="";
		int l=0,ct=0;
		for(int i=0;i<t;i++)
		{
			ct=0;
			inp=sc.next();
			l=inp.length();
			for(int j=0;j<l;j++)
			{
				if(j<(l-1))
				{
					if(!temp.equalsIgnoreCase(inp.substring(j, j+2)))
					{
						ct++;
						temp=inp.substring(j, j+2);
					}
				}
			}
			o[i]=ct;
		}
		for(int i=0;i<t;i++)
		{
			if(o[i]>=4)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
