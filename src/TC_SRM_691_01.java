import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TC_SRM_691_01 {

	static int ct=0;
	static String arr[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(getorder(str));
	}
	public static String getorder(String s)
	{
		int fact=1;
		for(int i=1;i<=s.length();i++)
		{
			fact*=i;
		}
		arr=new String[fact];
		
		String ar[]=permutation("",s);
		ar=arr;
		int small=9999999;
		int count=0;
		int penalty=0;
		String ret="";
		int[] save=new int[ar.length];
		int savepenalty[]=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			count=0;
			penalty=0;
			for(int j=0;j<ar[i].length();j++)
			{
				if(ar[i].charAt(j)=='+')
				{
					count++;
				}
				else
				{
					//System.out.println("aa "+(Integer.parseInt(""+ar[i].charAt(j))));
					int d=(count-(Integer.parseInt(""+ar[i].charAt(j))));
					count=count-d;
					penalty+=d;
				}
			}
			save[i]=count;
			savepenalty[i]=penalty;
			if(count<small)
			{
				small=count;
				ret=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			//System.out.println("hi");
			for(int j=0;j<ar.length;j++)
			{
				if(save[i]>save[j])
				{
					int temp=save[i];
					save[i]=save[j];
					save[j]=temp;
					String tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
				}
			}
		}
		//System.out.println("hello "+ar.length);
		int less=save[0];
		int indx=0;
		int pen=savepenalty[0];
		int temp=0;
		for(int i=1;i<ar.length;i++)
		{
			//System.out.println(ar[i]+" hel "+save[i]);
			if(less==save[i])
			{
				//System.out.println(ar[indx]+ " gfgf "+ar[i]);
				if(ar[indx].compareTo(ar[i])>0)
				{
				//	System.out.println(ar[indx]+" hi");
					//less=save[indx];
					ret=ar[i];
					indx=i;
					temp=1;
				}
			}
		}
		if(temp==0)
		{
			for(int i=1;i<ar.length;i++)
			{
				//System.out.println(ar[i]+" hel "+save[i]);
				if(pen==savepenalty[i])
				{
					//System.out.println(ar[indx]+ " gfgf "+ar[i]);
					//	System.out.println(ar[indx]+" hi");
						//less=save[indx];
						ret=ar[i];
						indx=i;
				}
			}
			
		}
		return ret;
		
	}
	private static String[] permutation(String perm, String word) 
	{
		if (word.isEmpty()) 
		{
			//System.out.println("bu "+ct);
			//System.out.println(perm + word);
			arr[ct++]=perm + word;
			
		}
		else
		{
			for (int i = 0; i < word.length(); i++)
			{
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
		return arr;
	}

}
