import java.util.Scanner;

public class TC_SRM_148_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=howMany(num);
		System.out.println(count);
	}
	public static int howMany(int number)
	{
		int dup=number;
		int rem=0,count=0;
		while(dup>0)
		{
			rem=dup%10;
			if(rem!=0)
			{
				if(number%rem==0)
				{
					count++;
				}
			}
			dup/=10;
		}
		return count;
		
	}
	
}
