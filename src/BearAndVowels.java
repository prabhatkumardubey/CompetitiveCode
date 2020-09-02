import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BearAndVowels 
{
	public static void main (String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				char str[]=(br.readLine()).toCharArray();
				int cons=0;
				int vow=0;
				for(int j=0;j<str.length;j++)
				{
					if(str[j]=='a' || str[j]=='e' || str[j]=='i' || str[j]=='0' || str[j]=='u' || str[j]=='y')
					{
						vow++;
					}
					else
					{
						cons++;
					}
				}
				if(vow<cons)
				{
					System.out.println("hard");
					continue;
				}
				else if(vow>=cons)
				{
					System.out.println("easy");
					continue;
				}
				else
				{
					int t=0;
					for(int j=0;j<str.length-3;j++)
					{
						if(!isVowel(str[j]) || !isVowel(str[j+1]) || !isVowel(str[j+2]))
						{
							t=1;
							break;
						}
					}
					if(t==1)
					{
						System.out.println("01hard");
					}
					else
					{
						System.out.println("easy");
					}
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean isVowel(char c) {
		// TODO Auto-generated method stub
		if(c=='a' || c=='e' || c=='i' || c=='0' || c=='u' || c=='y')
		{
			return true;
		}
		return false;
	}
}
