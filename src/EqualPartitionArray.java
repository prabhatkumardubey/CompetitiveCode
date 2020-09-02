import java.util.ArrayList;
import java.util.List;

public class EqualPartitionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={534,260,643,230,450,560,430,210};
		int[] a=divide(arr);
		//for(int i=0;i<2;i++){
			for(int j=0;j<a.length;j++){
				//System.out.println(i+" "+j);
				System.out.print(a[j]+",");
			//}
			//System.out.println();
		}
	}
	public static int[] divide(int[] x)
	{
		List <Integer > list = new ArrayList <Integer>();
		List <Integer> part = new ArrayList <Integer>();
		int sum = 0;
		for (Integer num : x)
		{
			list.add(num);
			sum += num;
		 }
		if (sum % 2 == 1){
			int empty[]=new int[0];
			return empty;
		}
		sum /= 2;
		int[][] memo = new int[x.length + 1][sum + 1];
		for (int i = 1; i <= x.length; ++i)
		{
			for (int s = 1; s <= sum; ++s)
			{
				if (x[i - 1] > s || memo[i - 1][s] > x[i - 1]+ memo[i - 1][s - x[i - 1]])
					memo[i][s] = memo[i - 1][s];
				else
				{
					memo[i][s] = x[i - 1] + memo[i - 1][s - x[i - 1]];
				}
			}
		  }
		  if (memo[x.length][sum] != sum)
			  return null;
		  int i = x.length;
		  int s = sum;
		  while (s > 0 && i > 0)
		  {
			  if (x[i - 1] <= s && memo[i][s] == x[i - 1] + memo[i - 1][s - x[i - 1]])
			  {
				  part.add(x[i - 1]);
				  s = s - x[i - 1];
			  }
			  i--;
		  }
		  for (Integer num : part)
			  	list.remove(num);
		  Integer[][] result = new Integer[2][];
		  result[0] = part.toArray(new Integer[] {});
		  result[1] = list.toArray(new Integer[] {});
		  
		  int[] temp=new int[x.length];
		  for(int j=0;j<x.length;j++){
			  for(int k=0;k<2;k++){
				  for(int l=0;l<result[k].length;l++){
					  if(result[k][l]!=-1 && result[k][l]==x[j]){
						  if(k==0){
							  temp[j]=1;
						  }
						  else if(k==1){
							  temp[j]=-1;
						  }
					  }
				  }
			  }
		  }
		  
		  return temp;
	}
}
