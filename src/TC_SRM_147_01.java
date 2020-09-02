
public class TC_SRM_147_01 
{
	public static void main(String args[])
	{
		String str=decode("ABCDE",2);
		System.out.println(str);
	}
	public static String decode(String cipherText, int shift)
	{
		String newString="";
		int length=cipherText.length();
		int temp=0;
		for(int i=0;i<length;i++)
		{
			temp= cipherText.charAt(i);
			temp-=shift;
			if(temp<65)
			{
				temp=(90+(temp-64));
			}
			char ch=(char)((int)temp);
			newString+=ch;
		}
		return newString;
	}
}
