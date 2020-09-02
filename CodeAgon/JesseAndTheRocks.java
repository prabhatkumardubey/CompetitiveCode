import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JesseAndTheRocks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int strengthJesse=sc.nextInt();
    	int strengthRock[]=new int[N];
    	int count=0;
    	int temp=0;
    	for(int i=0;i<N;i++)
    	{
    		strengthRock[i]=sc.nextInt();
    		if(strengthRock[i]<=strengthJesse)
    		{
    			count++;
    		}
    		else
    		{
    			if(temp==0)
    			{
    				temp=1;
    			}
    			else
    			{
    				break;
    			}
    		}
    	}
    	System.out.println(count);
    }
}