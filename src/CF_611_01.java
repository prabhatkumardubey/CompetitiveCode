import java.util.Scanner;

public class CF_611_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String of=sc.next();
		String format=sc.next();
		int day[]={31,29,31,30,31,30,31,31,30,31,30,31};
		int ct=0,count;
		if(format.equalsIgnoreCase("week"))
		{
			count=5;
			for(int i=1;i<=12;i++)
			{
				for(int j=1;j<=day[i-1];j++)
				{
					count++;
					if(count>7)
					{
						count=1;
					}
					if(count==x)
					{
						ct++;
					}
				}
			}
		}
		else if(format.equalsIgnoreCase("month"))
		{
			for(int i=1;i<=12;i++)
			{
				if(x<=day[i-1])
				{
					ct++;
				}
			}
		}
		System.out.println(ct);
	}
}
