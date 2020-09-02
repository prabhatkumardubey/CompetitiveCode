import java.io.*;
public class CountStepsNSquare 
{
	public static void main(String s[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int o[]=new int[t];
		int m=0,num=0,index=0,ai=0,aj=0,bi=0,bj=0,count=0;
		for(int i=0;i<t;i++)
		{
			m=Integer.parseInt(br.readLine());
			int a[][]=new int[m][m];
			for(int j=0;j<m;j++)
			{
				for(int k=0;k<m;k++)
				{
					a[j][k]=Integer.parseInt(br.readLine());
				}
			}
			index=findNum(1,a,m);
			aj=index%10;
			index=index/10;
			ai=index;
			num=1;
			count=0;
			do
			{
				num++;
				index=findNum(num,a,m);
				bj=index%10;
				index=index/10;
				bi=index;
				if(ai>bi && aj>bj)
				{
			        for(int k=0;k<(ai-bi);k++)
			        {
			            count++;
			        }
			        for(int k=0;k<(aj-bj);k++)
			        {
			            count++;
			        }
			    }
			    else if(ai>bi && aj<bj)
			    {
			        for(int k=0;k<(ai-bi);k++)
			        {
			            count++;
			        }
			        for(int k=0;k<(bj-aj);k++)
			        {
			            count++;
			        }
			    }
			    else if(ai<bi && aj>bj)
			    {
			        for(int k=0;k<(bi-ai);k++)
			        {
			            count++;
			        }
			        for(int k=0;k<(aj-bj);k++)
			        {
			            count++;
			        }
			    }
			    else if(ai<bi && aj<bj)
			    {
			        for(int k=0;k<(bi-ai);k++)
			        {
			            count++;
			        }
			        for(int k=0;k<(bj-aj);k++)
			        {
			            count++;
			        }
			    }
			}while(num!=(m*m));
			o[i]=count;
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(o[i]);
		}
	}
	public static int findNum(int num,int a[][],int m)
	{
		int index=0,temp=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==num)
				{
					index=(i*10)+j;
					temp=1;
					break;
				}
			}
			if(temp==1)
			{
				break;
			}
		}
		return index;
	}
}
