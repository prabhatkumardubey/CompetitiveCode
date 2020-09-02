import java.io.*;
import java.util.ArrayList;
//wrong answer
class DSH {
	public static int num[]={16,17,18,19,20,21,22,23,24,25,26,27,19,20,21,22,23,24,25,26,18,19,20,21,22,23};
	public static char letter[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static ArrayList<String> ar=new ArrayList<String>();
	public static String str="122";
	public static int len,threshold=23,index=0,count=0;
	public static void main(String args[])throws NullPointerException,IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ar.add(str);
		str=br.readLine();
		if(str!=null){
			while(!(str).equals("out"))
			{
				ar.add(str);
				br.readLine();
				str=br.readLine();
			}
		}
		len=ar.size();
		for(int i=1;i<len;i++)
		{
			str=ar.get(i);
			int strlen=str.length();
			count=0;
			for(int j=0;j<strlen;j++)
			{
				index=searchIndex(str.charAt(j));
				if(index!=-1)
				{
					System.out.print(num[index]+" ");
					if(num[index]>threshold)
					{
						count++;
					}
				}
			}
			System.out.println();
			if(count==0)
			{
				System.out.println("\nno one.\n");
			}
			else
			{
				System.out.println("\n"+count+"\n");
			}
		}
		}
		catch(Exception e)
		{
			
		}
	}
	public static int searchIndex(char ch)
	{
		for(int i=0;i<26;i++)
		{
			if(ch==letter[i])
			{
				return i;
			}
		}
		return -1;
	}
}
