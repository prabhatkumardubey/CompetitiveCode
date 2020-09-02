import java.util.ArrayList;
import java.util.Scanner;

class TaxiPlease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int S[]=new int[N];
		int J[]=new int[N];
		int Taxi[]=new int[M];
		int ss[]=new int[N];
		ArrayList<Integer> userno=new ArrayList<Integer>();
		ArrayList<Integer> start=new ArrayList<Integer>();
		ArrayList<Integer> end=new ArrayList<Integer>();
		for(int i=0;i<M;i++){
			Taxi[i]=i+1;
		}
		int min=0;
		for(int i=0;i<N;i++){
			S[i]=sc.nextInt();
			J[i]=sc.nextInt();
			userno.add(i+1);
			start.add(S[i]);
			end.add(S[i]+J[i]);
			if(min>S[i]){
				min=S[i];
			}
		}
		for(int i=0;i<N;i++){
			
		}
	}

}
