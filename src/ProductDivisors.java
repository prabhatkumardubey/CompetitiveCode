import java.math.BigInteger;
import java.util.Scanner;

class ProductDivisors {

	public static BigInteger modulo=new BigInteger("1000000007");
	public static BigInteger solve=new BigInteger("1");
	public static BigInteger two=new BigInteger("2");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		BigInteger prod=new BigInteger("1");
		while(N-->0){
			prod=sc.nextBigInteger();
			solve=solve.multiply(prod);
		}
		BigInteger x = new BigInteger("2");
		BigInteger total = new BigInteger("0");
		BigInteger totalFactors =new BigInteger("1");
		while (x.multiply(x).compareTo(solve) <= 0) {
		    int power = 0;
		    while (solve.mod(x).equals(BigInteger.ZERO)) {
		        power++;
		        solve = solve.divide(x);
		    }
		    total = new BigInteger(""+(power + 1));
		    totalFactors=totalFactors.multiply(total);
		    x = x.add(BigInteger.ONE);
		}
		if (!(solve.equals(BigInteger.ONE))) {
		    totalFactors =totalFactors.multiply(two);
		}
		totalFactors=totalFactors.mod(modulo);
		System.out.println(totalFactors);
	}

}
