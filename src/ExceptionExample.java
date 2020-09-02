import java.util.*;
import java.io.*;


class Calculator1 
{
	public int power(int n, int p)throws Exception
	{
		int num = 0;
		if(n<0 || p<0)
		{
				throw new Exception("n and p should be non-negative");
		}
		num=(int) Math.pow(n, p);
		return num;
	}
}


class ExceptionExample{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator1 myCalculator = new Calculator1();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
