import java.util.Scanner;

class FairRations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int N = in.nextInt();
	     int B[] = new int[N];
	     for(int B_i=0; B_i < N; B_i++){
	        B[B_i] = in.nextInt();
	     }
	     int count=0;
	     int temp=0;
	     int ct=0;
	     while(checkEven(B)){
	    	 if(++ct>N*N){
	    		 temp=1;
	    		 break;
	    	 }
	    	 for(int i=0;i<N;i++){
	    		 if(B[i]%2!=0){
	    			 B[i]++;
	    			 count++;
	    			 if(i>0){
		    			 if(B[i-1]%2!=0){
		    				 B[i-1]++;
		    				 count++;
		    			 }
		    			 else if(i+1<N){
		    				 B[i+1]++;
		    				 count++;
		    			 }
		    			 else{
		    				 B[i-1]++;
		    				 count++;
		    			 }
	    			 }
	    			 else if(i+1<N){
	    				 B[i+1]++;
	    				 count++;
	    			 }
	    			 else if(i>0){
	    				 B[i-1]++;
	    				 count++;
	    			 }
	    		 }
	    	 }
	     }
	     if(temp==1){
	    	 System.out.println("NO");
	     }
	     else{
	    	 System.out.println(count);
	     }
	}

	private static boolean checkEven(int[] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<b.length;i++){
			if(b[i]%2!=0){
				return true;
			}
		}
		return false;
	}

}
