import java.util.Scanner;

public class PrachandPrimeNumberFinder {
	 public static void main(String args[]) {
		 try {
		 Scanner scanner=new Scanner(System.in);
	     int numberOfTestCase=scanner.nextInt();
	     
	     while(numberOfTestCase > 0) {
	    	 int startNum = scanner.nextInt();
	    	 int endNum = scanner.nextInt();
	    	 int countPrimaryNumber = 0;
	    	 boolean isPP = false;
	    	 int startCount = getPPrimeCount(startNum);
	    	 if(isPrime(startCount)) {
	    		 countPrimaryNumber++;
	    		 isPP = true;
	    	 }
	    	 for(int i = startNum+1; i<=endNum; i++) {
	    		 if(isPrime(i)) {
	    			 startCount++;
	    			 if(isPrime(startCount)) {
	    				 countPrimaryNumber++;
	    				 isPP = true;
	    			 } else {
	    				 isPP = false;
	    			 }
	    		 }else if (isPP) {
	    			 countPrimaryNumber++;
	    		 }
	    	 }
	    	 
	    	 System.out.println(countPrimaryNumber);
	     }
	     
	     scanner.close();
		 }
		 catch(Exception e) {
			 
		 }
     }
	 
	 private static boolean isPrime(int number) {
		 if(number==1) return false;
		 if(number==2) return true;
		 if(number%2 == 0) return false;
		 for(int i=3; i<=Math.sqrt(number); i=i+2) {
			 if(number%i == 0) return false;
		 }
		 return true;
	 }
	 
	 private static int getPPrimeCount(int number) {
		 int count = 0;
		 for(int i=1; i<=number; i++) {
			 if(isPrime(i)) count++;
		 }
		 return count;
	 }
}