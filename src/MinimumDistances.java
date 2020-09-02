import java.util.Scanner;

class MinimumDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int min=-1;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        		if(A[i]==A[j]){
        			int temp=Math.abs(i-j);
	        		if(temp<min || min<0){
	        			min=temp;
	        		}
        		}
        	}
        }
        System.out.println(min);
	}

}
