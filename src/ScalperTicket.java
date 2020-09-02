import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ScalperTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N;
		
		try {
			N = Integer.parseInt(br.readLine());
			int A[]=new int[N];
			for(int i=0;i<N;i++){
				A[i]=Integer.parseInt(br.readLine());
			}
			int K=Integer.parseInt(br.readLine());
			System.out.println(getSum(N, A, K));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static long getSum(int n, int[] a, int k) {
		// TODO Auto-generated method stub
		long sum=0;
		int big=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>big){
				big=a[i];
			}
		}
		int count=0;
		while(count<k){
			for(int i=0;i<n;i++){
				if(a[i]>=big && count<k){
					sum+=a[i];
					a[i]--;
					count++;
				}
			}
			big--;
		}
		return sum;
	}

}
