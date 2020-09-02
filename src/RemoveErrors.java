import java.io.*;
public class RemoveErrors 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String start[]=new String[t];
		String end[]=new String[t];
		String data[]=new String[t];
		int indxStart=0,indxEnd=0;
		for(int i=0;i<t;i++)
		{
			start[i]=br.readLine();
			end[i]=br.readLine();
			data[i]=br.readLine();
		}
		for(int i=0;i<t;i++)
		{
			char chStart[]=start[i].toCharArray();
			char chEnd[]=end[i].toCharArray();
			char chData[]=data[i].toCharArray();
			indxStart=-1;
			indxEnd=-1;
			for(int j=0;j<chData.length-1;j++)
			{
				if(indxStart==-1)
				{
					if(chStart[0]==chData[j] && chStart[1]==chData[j+1])
					{
						indxStart=j;
					}
				}
				if(indxEnd==-1 && indxStart != -1)
				{
					if(chEnd[0]==chData[j] && chEnd[1]==chData[j+1])
					{
						indxEnd=j+1;
					}
				}
				if(indxStart!=-1 && indxEnd!=-1)
				{
					for(int k=indxStart;k<indxEnd;k++)
					{
						chData[k]='a';
					}
					indxStart=-1;
					indxEnd=-1;
				}
			}
			for(int j=0;j<chData.length;j++)
			{
				if(chData[j]!='a')
				{
					System.out.print(chData[j]);
				}
			}
			System.out.println();
		}
	}
}
