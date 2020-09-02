import java.io.*;

public class HammingDistance {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Integer.parseInt(br.readLine());
    	String str=br.readLine();
    	int Q=Integer.parseInt(br.readLine());
    	for(int i=0;i<Q;i++)
    	{
    		String ch=br.readLine();
    		if(ch.charAt(0)=='C')
    		{
    			String ar[]=ch.split(" ");
    			int s=Integer.parseInt(ar[1]);
    			int e=Integer.parseInt(ar[2]);
    			char change=ar[3].charAt(0);
    			for(int j=s-1;j<e;j++)
    			{
    				str=str.replace(str.charAt(j), change);
    			}
    		}
    		else if(ch.charAt(0)=='S')
    		{
    			String ar[]=ch.split(" ");
    			int s1=Integer.parseInt(ar[1]);
    			int e1=Integer.parseInt(ar[2]);
    			int s2=Integer.parseInt(ar[3]);
    			int e2=Integer.parseInt(ar[4]);
    			String str1="";
    			if(e1-1<str.length()-1)
    			{
    				str1=str.substring(s1-1,e1);
    			}
    			else
    			{
    				str1=str.substring(s1-1);
    			}
    			String str2="";
    			if(e2-1<str.length()-1)
    			{
    				str2=str.substring(s2-1,e2);
    			}
    			else
    			{
    				str2=str.substring(s2-1);
    			}
    			str=str.substring(0,s1-1)+str2+str.substring(e1,s2-1)+str1;
    		}
    		else if(ch.charAt(0)=='R')
    		{
    			String ar[]=ch.split(" ");
    			int s=Integer.parseInt(ar[1]);
    			int e=Integer.parseInt(ar[2]);
    			String str1=str.substring(s-1, e);
    			String str2="";
    			for(int k=str1.length()-1;k>=0;k--)
    			{
    				str2+=str1.charAt(k);
    			}
    			if(s==1)
    			{
    				str=str2+str.substring(e);
    			}
    			else
    			{
    				str=str.substring(0, s)+str2+str.substring(e);
    			}
    			//System.out.println(str);
    		}
    		else if(ch.charAt(0)=='W')
    		{
    			String ar[]=ch.split(" ");
    			int s=Integer.parseInt(ar[1]);
    			int e=Integer.parseInt(ar[2]);
    			System.out.println(str.substring(s-1,e));
    		}
    		else if(ch.charAt(0)=='H')
    		{
    			String ar[]=ch.split(" ");
    			int s1=Integer.parseInt(ar[1]);
    			int s2=Integer.parseInt(ar[2]);
    			int l=Integer.parseInt(ar[3]);
    			String str1="";
    			if(s1+l<str.length()-1)
    			{
    				str1=str.substring(s1-1,s1+l);
    			}
    			else
    			{
    				str1=str.substring(s1-1);
    			}
    			String str2="";
    			if(s1+l<str.length()-1)
    			{
    				str2=str.substring(s2-1, s2+l);
    			}
    			else
    			{
    				str2=str.substring(s2-1);
    			}
    			int count=0;
    			for(int k=0;k<l;k++)
    			{
    				if(str1.charAt(k)!=str2.charAt(k))
    					count++;
    			}
    			System.out.println(count);
    		}
    	}
    }
}