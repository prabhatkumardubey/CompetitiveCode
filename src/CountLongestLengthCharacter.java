import java.io.BufferedReader;
import java.io.InputStreamReader;

class CountLongestLengthCharacter {

    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=new String[n];
        String fullStr="";
        int c1=0,big=0;
        for(int i=0;i<n;i++)
        {
        	s[i]=br.readLine();
        	fullStr+=s[i];
        	c1=countStreak(s[i]);
        	if(big<c1)
        	{
        		big=c1;
        	}
        }
        c1=big;
        int c2=countStreak(fullStr);
        System.out.println(c1+" "+c2);

    }
    public static int countStreak(String str)
    {
    	int count=0;
    	int big=0;
    	int temp=0;
    	for(int i=0;i<str.length();i++)
    	{
    		count=0;
    		if(str.charAt(i)=='C')
    		{
    			for(int j=i;j<str.length();j++)
    			{
    				if(str.charAt(j)=='C')
    				{
    					count++;
    				}
    				else
    				{
    					break;
    				}
    			}
    			if(big<count)
    			{
    				big=count;
    			}
    		}
    	}
    	return big;
    }
}
