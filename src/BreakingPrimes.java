import java.util.Scanner;

public class BreakingPrimes {
	public static boolean[] primes;	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int Q=sc.nextInt();
		while(Q-->0){
			int A=sc.nextInt();
			int B=sc.nextInt();
			int K=sc.nextInt();
			int P=A;
			checkPrime(B);
			int count=0,temp=0;
			while(P<=B){
				if(isPrime(P)){
					count++;
				}
				if(count==K){
					temp=1;
					break;
				}
				P++;
			}
			if(temp==0){
				System.out.println("-1");
			}
			else{
				System.out.println(P);
			}
		}
	}
	public static boolean isPrime(int num)
	{
    	return primes[num];
	}
    public static void checkPrime(int n)
    {
    	primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
    }
}
