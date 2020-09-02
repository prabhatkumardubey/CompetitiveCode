import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class FibonacciModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = br.readLine();
			String split[]=str.split(" ");
			int a=Integer.parseInt(split[0]);
			int b=Integer.parseInt(split[1]);
			int n=Integer.parseInt(split[2]);
			BigInteger n1=new BigInteger(a+"");
			BigInteger n2=new BigInteger(b+"");
			BigInteger temp=new BigInteger("0");
			for(int i=2;i<n;i++)
			{
				temp=n2;
				n2=(n2.pow(2)).add(n1);
				n1=temp;
			}
			System.out.println(n2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
