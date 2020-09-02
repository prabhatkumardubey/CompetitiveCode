//program to find number of equal non-overlapping substring of any string
public class TC_SRM_683_01 
{
	public static void main(String srgs[])
	{
		int i=get("onetwothreeonetwothree");
	}
	public static int get(String s)
	{
		/*int length=s.length();
		int temp=1,ct=0;
		String st="";
		while(temp<length)
		{
			for(int i=0;i<length-temp;i++)
			{
				st=s.substring(i,i+temp);
				for(int j=i+temp;j<=length-temp;j++)
				{
					if(st.equals(s.substring(j,j+temp)))
					{
						ct++;
					}
				}
			}
			temp++;
		}
		System.out.println(ct);
		return ct;
		*/
		int counter=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String substring=s.substring(i,j);
				counter+=findInString(s,substring,i,j);
			}
		}
		System.out.println(counter);
		return counter;
	}
	private static int findInString(String string, String substring, int start, int end) {
		// TODO Auto-generated method stub
		int counter=0;
		for(int i=end;i<=string.length();i++)
		{
			for(int j=i+1;j<=string.length();j++)
			{
				String substring2=string.substring(i,j);
				if(substring.equals(substring2))
				{
					counter++;
				}
			}
		}
		return counter;
	}
}
