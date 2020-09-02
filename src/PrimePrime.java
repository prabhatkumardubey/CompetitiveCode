import java.util.ArrayList;
import java.util.Scanner;

class PrimePrime {
	public static boolean[] primes;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
        	int temp=0;
        	int count=0;
        	int L=sc.nextInt();
        	int R=sc.nextInt();
        	checkPrime(R);
        	for(int i=L;i<=R;i++)
        	{
        		temp=0;
        		for(int j=1;j<=i;j++)
        		{
        			if(isPrime(j))
        			{
        				temp++;
        			}
        		}
        		if(isPrime(temp))
        		{
        			count++;
        		}
        	}
        	System.out.println(count);
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
