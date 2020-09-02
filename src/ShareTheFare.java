import java.util.*;

public class ShareTheFare 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int N=sc.nextInt();
			int Q=sc.nextInt();
			String NA[]=new String[N];
			int NAM[]=new int[N];
			int NAP[]=new int[N];
			for(int j=0;j<N;j++)
			{
				NA[j]=sc.next();
			}
			String QAN[]=new String[Q];
			int QAA[]=new int[Q];
			int QAM[]=new int[Q];
			for(int j=0;j<Q;j++)
			{
				QAN[j]=sc.next();
				int idx=0;
				for(int l=0;l<N;l++)
				{
					if(NA[l].equals(QAN[j]))
					{
						idx=l;
						break;
					}
				}
				QAA[j]=sc.nextInt();
				NAP[idx]=QAA[j];//nap paid
				QAM[j]=sc.nextInt();
				int temp=QAA[j]/(QAM[j]+1);
				for(int k=0;k<QAM[j];k++)
				{
					String mname=sc.next();
					int index=0;
					for(int l=0;l<N;l++)
					{
						if(NA[l].equals(mname))
						{
							index=l;
							break;
						}
					}
					NAM[index]-=temp;
					QAA[j]-=temp;
				}
				NAM[idx]-=QAA[j];
			}
			for(int j=0;j<N;j++)
			{
				int total=NAP[j]+NAM[j];
				if(total<0)
				{
					total*=(-1);
					System.out.println(NA[j]+" owes "+total);
				}
				else if(total>0)
				{
					System.out.println(NA[j]+" is owed "+total);
				}
				else
				{
					System.out.println(NA[j]+" neither owes nor is owed");
				}
			}
		}
	}
}
