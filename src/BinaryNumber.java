import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumber 
{

    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
        	int num=Integer.parseInt(br.readLine());
        	String bin="";
        	while(num>0)
        	{
        		if(num%2==0)
        		{
        			bin="0"+bin;
        		}
        		else
        		{
        			bin="1"+bin;
        		}
        		num/=2;
        	}
        	System.out.println(bin);
        }
    }
}
