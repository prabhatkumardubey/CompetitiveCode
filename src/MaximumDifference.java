import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int N=Integer.parseInt(br.readLine());
			String str=br.readLine();
			String split[]=str.split(" ");
			int A[]=new int[N];
			for(int i=0;i<N;i++)
			{
				A[i]=Integer.parseInt(split[i]);
			}
			int index=0;
			for(int i=0;i<N;i++)
			{
				int small=A[i];
				index=i;
				for(int j=i+1;j<N;j++)
				{
					if(small>A[j])
					{
						small=A[j];
						index=j;
					}
				}
				int temp=A[index];
				A[index]=A[i];
				A[i]=temp;
			}
			int small[];
			int large[];
			if(N%2!=0)
			{
				small=new int[(N/2)+1];
				large=new int[N/2];
				int j=0;
				for(int i=0;i<small.length;i++,j++)
				{
					small[i]=A[j];
				}
				for(int i=0;i<large.length;i++,j++)
				{
					large[i]=A[j];
				}
				j=0;
				int k=0;
				for(int i=0;i<N;i++)
				{
					if(i%2==0)
					{
						A[i]=small[j++];
					}
					else
					{
						A[i]=large[k++];
					}
				}
				int sum=0;
				for(int i=0;i<N-1;i++)
				{
					int dif=A[i]-A[i+1];
					if(dif<0)
					{
						dif*=(-1);
					}
					sum+=dif;
				}
				System.out.println(sum);
			}
			else
			{
				small=new int[N/2];
				large=new int[N/2];
				int j=0;
				for(int i=0;i<small.length;i++,j++)
				{
					small[i]=A[j];
				}
				for(int i=0;i<large.length;i++,j++)
				{
					large[i]=A[j];
				}
				j=0;
				int k=0;
				for(int i=0;i<N;i++)
				{
					if(i%2==0)
					{
						A[i]=small[j++];
					}
					else
					{
						A[i]=large[k++];
					}
				}
				int sum=0;
				for(int i=0;i<N-1;i++)
				{
					int dif=A[i]-A[i+1];
					if(dif<0)
					{
						dif*=(-1);
					}
					sum+=dif;
				}
				System.out.println(sum);
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
