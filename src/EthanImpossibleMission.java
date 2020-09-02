import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EthanImpossibleMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		BigInteger M=sc.nextBigInteger();
		ArrayList<BigInteger> A=new ArrayList<BigInteger>(N);
		ArrayList<BigInteger> AQ=new ArrayList<BigInteger>(Q);
		for(int i=0;i<N;i++){
			A.add(sc.nextBigInteger());
		}
		for(int i=0;i<Q;i++){
			AQ.add(sc.nextBigInteger());
			System.out.println((compute(A,AQ.get(i))).mod(M));
		}
		
	}
	public static BigInteger compute(ArrayList<BigInteger> ar, BigInteger index){
		//ar.remove(index.subtract(BigInteger.ONE));
		BigInteger mul=BigInteger.ONE;
		for(int i=0;i<ar.size();i++){
			if(i==index.intValue()-1)continue;
			mul=mul.multiply(ar.get(i));
		}
		return mul;
	}
}
