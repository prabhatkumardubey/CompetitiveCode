public class ReadPrevious 
{
	public static void main(String s[])
	{
		int num=1,rev=0;
		int temp=num;
		while(temp>0)
		{
			rev=(rev*10)+(temp%10);
			temp/=10;
		}
		System.out.println(num);
		for(int i=1;i<5;i++)
		{
			num=nextLine(num);
			System.out.println(num);
		}
	}
	public static int nextLine(int rev)
	{
		int next=0,count=0;
		int temp2=rev%10;
		int temp=rev%10;
		do
		{
			if(rev%10 == temp2)
			{
				temp=rev%10;
				count++;
			}
			else
			{
				next=(next*10)+(count*10)+(temp);
				count=0;
				temp2=rev%10;
			}
			rev=rev/10;
		}while(rev>0);
		return next;
	}
}
