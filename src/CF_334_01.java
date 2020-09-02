import java.util.Scanner;

public class CF_334_01 
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int m[]=new int[5];
		int w[]=new int[5];
		int contest_marks[]={500,1000,1500,2000,2500};
		for(int i=0;i<5;i++)
		{
			m[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			w[i]=sc.nextInt();
		}
		int ss=sc.nextInt();
		int us=sc.nextInt();
		double val1=0;
	    double val2=0;
	    int sum=0;
	    for(int i=0;i<5;i++)
	    {
	        val1=(3*contest_marks[i])/10;
	        val2=(((250-m[i])*contest_marks[i])/250)-(50*w[i]);
	        if(val1>val2)
	        {
	            sum+=val1;
	        }
	        else
	        {
	            sum+=val2;
	        }
	    }
	    sum+=(100*ss);
	    sum-=(50*us);
	    System.out.println(sum);
	}
}
