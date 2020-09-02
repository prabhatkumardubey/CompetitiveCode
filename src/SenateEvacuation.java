import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SenateEvacuation 
{
	public static char alph[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				//System.out.println("hell");
				int N=Integer.parseInt(br.readLine());
				String inp=br.readLine();
				String splitstr[]=inp.split(" ");
				int P[]=new int[N];
				int big=0;
				for(int j=0;j<N;j++)
				{
					P[j]=Integer.parseInt(splitstr[j]);
					if(big<P[j])
					{
						big=P[j];
					}
				}
				char arr[][]=new char[N][big];
				for(int j=0;j<N;j++)
				{
					for(int k=0;k<P[j];k++)
					{
						arr[j][k]=alph[j];
					}
				}
				int temp=1;
				System.out.print("Case #"+(i+1)+": ");
				while(temp!=0)
				{
					//System.out.println("jkdfn");
					int cnt=0;
					while(cnt<2)
					{
						//System.out.println("hi");
						for(int k=0;k<N;k++)
						{
							//System.out.println("hieee" +cnt);
							if(cnt>=2)
							{
								break;
							}
							for(int l=0;l<P[k];l++)
							{
								if(arr[k][l]!='-')
								{
									System.out.print(arr[k][l]);
									arr[k][l]='-';
									l++;
									cnt++;
									break;
								}
							}
							if(cnt>=2)
							{
								break;
							}
						}
						int chk=0;
						for(int k=0;k<N;k++)
						{
							for(int l=0;l<P[k];l++)
							{
								if(arr[k][l]!='-')
								{
									chk=1;
									break;
								}
							}
						}
						if(chk==0)
						{
							cnt=2;
						}
						if(cnt>=2)
						{
							break;
						}
					}
					//for(int k=0;k<N;k++)
					//{
						//if(P[k]>0 && cnt<2)
						//{
							//System.out.print(alph[P[k]-1]);
							//P[k]--;
							//cnt++;
						//}
					//}
					//check
					for(int k=0;k<N;k++)
					{
						for(int l=0;l<P[k];l++)
						{
							if(arr[k][l]!='-')
							{
								temp=2;
								break;
							}
						}
					}
					if(temp==2)
					{
						temp=1;
					}
					else if(temp==1)
					{
						temp=0;
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
