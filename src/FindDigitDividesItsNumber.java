
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigitDividesItsNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int o[]=new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            o[a0]=countDigits(n);
        }
        for(int i = 0 ;i < t; i++)
        {
        	System.out.println(o[i]);
        }
    }

	private static int countDigits(int n) {
		// TODO Auto-generated method stub
		int dup=n;
		int count=0,rem=0;;
		while(dup>0)
		{
			rem=dup%10;
			if(rem!=0)
			{
				if(n%(rem)==0)
				{
					count++;
				}
			}
			dup/=10;
		}
		return count;
	}
}
