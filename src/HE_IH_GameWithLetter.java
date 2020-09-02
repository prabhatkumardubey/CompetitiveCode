import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HE_IH_GameWithLetter 
{
	private static String s;
	public static int score,count,big,team,N,T;
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		T=Integer.parseInt(br.readLine());
		int o[]=new int[T];
		for(int i=0;i<T;i++)
		{
			String str=br.readLine();
			String arr[]=str.split(" ");
			N=Integer.parseInt(arr[0]);
			s = arr[1];
			int teamScore[]=new int[N];
			int teamLength[]=new int[N];
			score=0;
			count=0;
			big=0;
			team=-1;
			for(int j=0;j<N;j++)
			{
				score=0;
				str=br.readLine();
				teamLength[j]=str.length();
				for(int k=0;k<teamLength[j];k++)
				{
					if(checkCharacter(str.charAt(k)))
					{
						score++;
					}
				}
				teamScore[j]=score;
			}
			for(int j=0;j<N;j++)
			{
				if(big<teamScore[j])
				{
					big=teamScore[j];
					team=j;
				}
			}
			count=0;
			for(int j=0;j<N;j++)
			{
				if(big==teamScore[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				count=0;
				for(int j=0;j<N;j++)
				{
					if(big==teamScore[j])
					{
						if(count==0)
						{
							count=teamLength[j];
							team=j;
						}
						else if(count>teamLength[j])
						{
							count=teamLength[j];
							team=j;
						}
						else if(count==teamLength[j])
						{
							if(team>j)
							{
								team=j;
							}
						}
					}
				}
			}
			o[i]=team+1;
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(o[i]);
		}
	}

	private static boolean checkCharacter(char ch) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
				return true;
		}
		return false;
	}
}
