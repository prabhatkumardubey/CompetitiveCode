import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String AMPM=time.substring(8);
        time=time.substring(0, 8);
        String[] arr=time.split(":");
        int[] clock=new int[3];
        String newtime="";
        for(int i=0;i<3;i++)
        {
        	clock[i]=Integer.parseInt(arr[i]);
        	System.out.println(clock[i]);
        	if(AMPM.equals("PM") && i==0)
        	{
        		if(clock[i]==12)
        		{
        			newtime+=(""+clock[i]);
        		}
        		else
        		{	
        			newtime+=(""+(clock[i]+12));
        		}
        	}
        	else if(AMPM.equals("AM") && i==0)
        	{
        		if(clock[i]==12)
        		{
        			clock[i]=0;
        		}
        		if(clock[i]%10==clock[i])
        		{
        			newtime+=("0"+(clock[i]));
        		}
        		else
        		{
        			newtime+=(""+(clock[i]));
        		}
        	}
        	else
        	{
        		if(clock[i]%10==clock[i])
        		{
        			newtime+=(":0"+clock[i]);
        		}
        		else
        		{
        			newtime+=(":"+clock[i]);
        		}
        	}
        }
        System.out.println(newtime);
    }
}
