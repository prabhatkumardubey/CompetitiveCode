import java.io.*;
import java.util.Scanner;
public class HE_CA_01 
{
	public static void main(String s[])throws IOException
	{
		int size=0,temp=0,regval,regtemp=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String reg[]=new String[t];
		int o[]=new int[t];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<t;i++)
		{
			reg[i]=br.readLine();
			size=0;
			for(int j=0;j<reg[i].length();j++)
			{
				if(reg[i].charAt(j)=='X')
				{
					size++;
				}
			}
			int val[]=new int[size];
			for(int j=0;j<size;j++)
			{
				val[j]=sc.nextInt();
			}
			temp=0;
			regval=0;
			size=0;
			regtemp=0;
			for(int j=0;j<reg[i].length();j++)
			{
				if(reg[i].charAt(j)=='A')
				{
					temp=0;
					regval+=regtemp;
				}
				else if(reg[i].charAt(j)=='B')
				{
					temp=1;
				}
				else
				{
					if(temp==0)
					{
						regval+=val[size++];
					}
					else if(temp==1)
					{
						if(regtemp<val[size])
						{
							regtemp=val[size++];
						}
					}
				}
			}
			if(temp==1)
			{
				regval+=regtemp;
			}
			o[i]=regval;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
}
