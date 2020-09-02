
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestingInplementationExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	int a[]=new int[3];
    	int e[]=new int[3];
    	for(int i=0;i<3;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	for(int i=0;i<3;i++)
    	{
    		e[i]=sc.nextInt();
    	}
    	System.out.println(a[2]>e[2]?10000:(a[1]>e[1]?500*(a[1]-e[1]):(a[0]>e[0]?15*(a[0]-e[0]):0)));
    }
    public static int calculate(int ar[],int er[])
    {
    	if(ar[2]>er[2])
    	{
    		return 10000;
    	}
    	else if(ar[1]>er[1])
    	{
    		return 500*(ar[1]-er[1]);
    	}
    	else if(ar[0]>er[0])
    	{
    		return 15*(ar[0]-er[0]);
    	}
		return 0;
    	
    }
}