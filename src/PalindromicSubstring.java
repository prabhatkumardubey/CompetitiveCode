import java.io.*;

class PalindromicSubstring
{
	public static String[] s1subset;
	public static String[] s2subset;
	public static int length=0,size=0,flag=0;
	public static void main(String args[])throws Exception
	{
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			int T=Integer.parseInt(br.readLine());
			String o[]=new String[T];
			for(int k=0;k<T;k++)
			{
				String s1=br.readLine();
				String s2=br.readLine();
				length=s1.length();
				size=(length*(length+1))/2;
				s1subset=subset(s1);
				s2subset=subset(s2);
				flag=0;
				for(int i=0;i<size;i++)
				{
					flag=0;
					for(int j=0;j<size;j++)
					{
						if(s1subset[i].equals(s2subset[j]))
						{
							continue;
						}
						if(palindrome((s1subset[i]+s2subset[j])))
						{
							flag=1;
							break;
						}
					}
					if(flag==1)
					{
						break;
					}
				}
				if(flag==0)
					o[k]="No";
				else if(flag==1)
					o[k]="Yes";
			}
			for(int i=0;i<T;i++)
			{
				System.out.println(o[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return;
		} 
	}
	private static boolean palindrome(String string) {
		String reverse = new StringBuffer(string).reverse().toString();
		for (int i=0; i<length; i++) {
            if (string.charAt(i) != string.charAt(length-i-1)) {
                return false;
            }
        }
		return true;
		/*if(reverse.equals(string))
			return true;
		return false;*/
	}
	private static String[] subset(String s) {
		// TODO Auto-generated method stub
		int count=0;
		String ssubset[]=new String[size];
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<=length-i;j++)
			{
					ssubset[count++]=s.substring(i,i+j);
					System.out.println(ssubset[count-1]);
			}
		}
		return ssubset;
	}
}
