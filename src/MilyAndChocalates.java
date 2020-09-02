import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

class MilyAndChocalates {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<BigInteger> arr=new ArrayList<BigInteger>(N);
		BigInteger ct=BigInteger.ZERO;
		for(int i=0;i<N;i++){
			ct=ct.add(sc.nextBigInteger());
			arr.add(ct);
		}
		int T=sc.nextInt();
		while(T-->0){
			BigInteger num=sc.nextBigInteger();
			for(int i=0;i<N;i++){
				if(((arr.get(i)).compareTo(num))>=0){
					System.out.println(i+1);
					break;
				}
			}
		}
		sc.close();
	}

}
