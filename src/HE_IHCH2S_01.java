import java.util.ArrayList;
import java.util.Scanner;

public class HE_IHCH2S_01 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		ArrayList ar=new ArrayList();
		ArrayList score=new ArrayList();
		int count=0;
		String str="";
		int scor=0;
		int index=0,sum=0;
		for(int i=0;i<T;i++)
		{
			str=sc.next();
			scor=sc.nextInt();
			ar.add(str);
			score.add(i, scor);
			
		}
		for(int i=0;i<ar.size();i++)
		{
			str=(String) ar.get(i);
			scor=(int) score.get(i);
			for(int j=i+1;j<ar.size();j++)
			{
				String st=(String) ar.get(j);
				if(!str.equals(st))
				{
					break;
				}
				else if(str.equals(st))
				{
					count=(int) score.get(j);
					score.set(j, count+scor);
					
				}
			}
			if(sum<(int)score.get(i))
			{
				sum=(int) score.get(i);
				index=i;
			}
		}
		System.out.println(ar.get(index));
	}
}
