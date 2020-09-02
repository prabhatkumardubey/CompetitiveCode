import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {

	public static BigInteger num,dup,sum;
	public static BigInteger two=new BigInteger("2");
    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int T=Integer.parseInt(br.readLine());
    	while(T-->0)
    	{
    		num=new BigInteger(br.readLine());
    		//dup=num.;
    		System.out.println(dup);
    	}
    }
}