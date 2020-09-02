import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_CZ_01 {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = 0;
        int j,temp;
		for(int i=0;i<n;i++)
	    {
	        temp=prices[i];
	        j=i;
	        while(j>0)
	        {
	        	if(temp<prices[j-1])
	        	{
	        		prices[j]=prices[j-1];
	        		j--;
	        	}
	        	else
	        	{
	        		break;
	        	}
	        }
	        prices[j]=temp;
	    }
		temp=0;
		for(int i=0;i<n;i++)
		{
			if(k>=temp+prices[i])
			{
				temp+=prices[i];
				answer++;
			}
			else
			{
				break;
			}
		}
		// Compute the final answer from n,k,prices 
        System.out.println(answer);
    }
}
