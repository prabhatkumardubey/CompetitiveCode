import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SnakeAndLadders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				int ct=0;
				int N=Integer.parseInt(br.readLine());
				int L[][]=new int[N][2];
				for(int j=0;j<N;j++)
				{
					String str=br.readLine();
					String split[]=str.split(" ");
					L[j][0]=Integer.parseInt(split[0]);
					L[j][1]=Integer.parseInt(split[1]);
				}
				L=insertionSort(L,N);
				int M=Integer.parseInt(br.readLine());
				int S[][]=new int[M][2];
				for(int j=0;j<M;j++)
				{
					String str=br.readLine();
					String split[]=str.split(" ");
					S[j][0]=Integer.parseInt(split[0]);
					S[j][1]=Integer.parseInt(split[1]);
				}
				S=insertionSort(S,M);
				//Input end
				int check=0;
				int index=0,dupindex=0,value=0,dupvalue=0;
				int dupL[][]=L;
				int wt=0,small=-1;
				for(int j=1;j<100;)
				{
					wt=0;
					dupL=L;
					check=0;
					System.out.print("helo "+j);
					for(int k=0;k<N;k++)
					{
						wt=0;
						if(dupL[k][0]!=0 && dupL[k][0]>j)
						{
							dupindex=k;
							dupvalue=dupL[k][0];
							//System.out.print("abcd "+value);
							dupL[k][0]=0;
							check=1;
						}
						int rem=dupvalue%6;
						if(rem==0)
						{
							wt+=(dupvalue/6);
							int dif=100-dupL[dupindex][1];
							if(dif%6!=0)
							{
								dif=(dif/6)+1;
							}
							else
							{
								dif=dif/6;
							}
							wt+=dif;
						}
						else
						{
							wt+=((dupvalue/6)+1);
							int dif=100-dupL[dupindex][1];
							if(dif%6!=0)
							{
								dif=(dif/6)+1;
							}
							else
							{
								dif=dif/6;
							}
							wt+=dif;
						}
						if(small<0 || small>=wt)
						{
							small=wt;
							value=dupvalue;
							index=dupindex;
						}
						
					}
					System.out.println("hass "+small+" "+value+" "+index);
					if(check==0)
					{
						value=100;
					}
					int indx=0;
					int val=0;
					int chk=0;
					for(int k=j;k<=value;)
					{
						chk=0;
						System.out.print("bi "+k);
						for(int p=0;p<M;p++)
						{
							if(S[p][0]!=0 && S[p][0]<value)
							{
								indx=p;
								val=S[p][0];
								S[p][0]=0;
								chk=1;
								break;
							}
						}
						if(chk==0)
						{
							val=value;
						}
						if((val-k)>6)
						{
							k+=6;
							j=k;
							ct++;
						}
						else if((val-k)==6)
						{
							k+=5;
							j=k;
							ct++;
						}
						else
						{
							if((k+6)>value && value<100)
							{
								k+=(value-k);
								k=L[index][1];
								j=k;
								ct++;
							}
							else if(value==100 && (value-k)<=6)
							{
								k+=(value-k);
								j=k;
								ct++;
								break;
							}
							else
							{
								k+=6;
								j=k;
								ct++;
							}
						}
					}
				}
				System.out.println(ct);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static int[][] insertionSort(int[][] l, int n) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<n;i++)
		{
			j=i;
			while((j>0) && (l[j][0]<l[j-1][0]))
			{
				int temp = l[j][0];
				l[j][0]=l[j-1][0];
				l[j-1][0]=temp;
				temp=l[j][1];
				l[j][1]=l[j-1][1];
				l[j-1][1]=temp;
				j--;
			}
		}
		return l;
	}

}
