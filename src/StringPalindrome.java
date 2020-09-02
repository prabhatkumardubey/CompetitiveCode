import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int o[]=new int[T];
		String str="";
		int len,i,j=0,x,y;
	    for(int p=0;p<T;p++ )
	    {
	        str=br.readLine();
	        len = str.length();
	        for(i=0;i<len/2;i++)
	        {
	            j = len - 1 -i;
	            if(str.charAt(i)!=str.charAt(j)) 
	            {
	            	break;
	            }
	        }
	        if(i==len/2)
	        {
	            if(len%2==1)
	            {
	            	System.out.println(-1);
	                continue;
	            }
	        }
	        for(x=i+1,y=j;x<y;x++,y--) 
	        {
	        	if(str.charAt(x)!=str.charAt(y))
	        	{
	        		break;
	        	}
	        }
	            if(x>=y)
	            {
	            	System.out.println(i);
	            }
	            else
	            {
	                for(x=i,y=j-1;x<y;x++,y--)  
	                {
	                	if(str.charAt(x)!=str.charAt(y))  
	                	{
	                		break;
	                	}
	                }
	                if(x>=y)
	                {
	                	System.out.println(j);
	                }
	                else
	                {
	                	System.out.println("-1");
	                }
	            }
	        }
	    }
	}

