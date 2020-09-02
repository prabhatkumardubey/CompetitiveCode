import java.util.ArrayList;

public class TC_SRM_150_01 
{
	public static void main(String args[])
	{
		int arr[]={ 10, 0, 0, 4, 20 };
		days(arr,8);
	}
	public static int days(int[] arrivals, int numPerDay)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=0;i<arrivals.length;i++)
		{
			while(arrivals[i]>0)
			{
				if(arrivals[i]>=numPerDay)
				{
					ar.add(arrivals[i]-numPerDay);
					arrivals[i]-=numPerDay;
					if(i<arrivals.length-1)
					{
						arrivals[i+1]+=arrivals[i];
						break;
					}
				}
				else
				{
					ar.add(arrivals[i]);
					arrivals[i]=0;
				}
			}
		}
		//System.out.println(ar.size());
		return ar.size();
		
	}
}
