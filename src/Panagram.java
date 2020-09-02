import java.io.*;

public class Panagram {

	//public static char letter[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static char value[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	String str=br.readLine();
    	str=str.toLowerCase();
    	int len=str.length();
    	for(int i=0;i<len;i++)
    	{
    		int b= ((byte)str.charAt(i)-97);
    		if(b>=0 && b<26)
    		{
	        	if(value[b]==1)
	    		{
	    			value[b]=0;
	    		}
    		}
    	}
    	int temp=0;
    	for(int i=0;i<26;i++)
    	{
    		if(value[i]==1)
    		{
    			temp=1;
    			break;
    		}
    	}
    	if(temp==1)
    		System.out.println("not panagram");
    	else
    		System.out.println("panagram");
    }
}