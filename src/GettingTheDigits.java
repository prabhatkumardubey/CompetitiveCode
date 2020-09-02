import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class GettingTheDigits {

	public static String number[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				String S=br.readLine();
				char ar[]=S.toCharArray();
				String num="";
				int count=-1;
				String chk="";
				char arh[]=ar;
				while(!isEmpty(ar))
				{
					count++;
					char nar[]=number[count].toCharArray();
					char ch[]=ar;
					while(getNumber(ch,number[count]))
					{
						for(int j=0;j<ar.length;j++)
						{
							System.out.print(ar[j]);
						}
						chk="";
						for(int j=0;j<nar.length;j++)
						{
							for(int k=0;k<ar.length;k++)
							{
								if(ar[k]==nar[j])
								{
									//System.out.println("s "+ar[k]);
									chk+=ar[k];
									ar[k]='.';
									break;
								}
								//System.out.println("roshan "+chk);
							}
						}
						if(chk.equals(number[count]))
						{
							System.out.println("rosh "+count);
							num+=count;
						}
					}
					//arh=ar;
				}
				System.out.println("Case #"+(i+1)+": "+num);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static boolean getNumber(char[] arc, String numb) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<numb.length();i++)
		{
			for(int j=0;j<arc.length;j++)
			{
				if(arc[j]=='.')
				{
					continue;
				}
				if(numb.charAt(i)==arc[j])
				{
					count++;
					arc[j]='.';
					break;
				}
			}
		}
		if(count==numb.length())
		{
			System.out.println("true");
			return true;
		}
		return false;
	}
	private static boolean isEmpty(char[] arc) {
		// TODO Auto-generated method stub
		for(int i=0;i<arc.length;i++)
		{
			if(arc[i]!='.')
			{
				System.out.println("false");
				return false;
			}
		}
		return true;
	}

}
