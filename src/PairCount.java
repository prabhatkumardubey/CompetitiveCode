import java.math.BigInteger;
import java.util.Scanner;

class PairCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long D=sc.nextLong();
		long ar[]=new long[N];
		for(int i=0;i<N;i++){
			ar[i]=sc.nextLong();
		}
		int count=0;
		int temp=0;
		for(int i=0;i<N;i++){
			temp=0;
			for(int j=0;j<N;j++){
				if(ar[i]!=ar[j]){
				if(i!=j && ((ar[i]*ar[j])%D==0)){
					temp++;
				}}
			}
			if(temp>count){
				count=temp;
			}
		}
		System.out.println(count);
	}

}
