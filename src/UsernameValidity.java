import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UsernameValidity {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int N=Integer.parseInt(br.readLine());
    	String pattern="(.|_)(\\d+)[a-z][[a-z]* | (\\d+)]*(_{0,1})";
    	Pattern r=Pattern.compile(pattern);
    	while(N-->0)
    	{
    		String str=br.readLine();
    		int l=str.length();
    		//System.out.println(l);
    		Matcher m=r.matcher(str);
    		if(l<3)
    		{
    			System.out.println("INVALID");
    		}
    		else
    		{
    			if(str.matches(pattern))
    			{
    				System.out.println("VALID");
    			}
    			else
    			{
    				System.out.println("INVALID");
    			}
    		}
    	}
    }
}