import java.math.BigInteger;
import java.util.Scanner;

public class EconomyGame {
	static BigInteger house=new BigInteger("1234567");
	static BigInteger cars=new BigInteger("123456");
	static BigInteger computers=new BigInteger("1234");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BigInteger n=sc.nextBigInteger();
		BigInteger i=new BigInteger("1");
		int temp=0;
		for(;i.compareTo(BigInteger.TEN)<=0;i=i.add(BigInteger.ONE)){
			BigInteger j=new BigInteger("1");
			for(;j.compareTo(BigInteger.TEN)<=0;j=j.add(BigInteger.ONE)){
				BigInteger k=new BigInteger("1");
				for(;k.compareTo(BigInteger.TEN)<=0;k=k.add(BigInteger.ONE)){
					BigInteger sum=i.multiply(house);
					sum=sum.add(j.multiply(cars));
					sum=sum.add(k.multiply(computers));
					if(sum.equals(n)){
						temp=1;
						break;
					}
				}
				if(temp==1){
					break;
				}
			}
			if(temp==1){
				break;
			}
		}
		if(temp==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}

}
