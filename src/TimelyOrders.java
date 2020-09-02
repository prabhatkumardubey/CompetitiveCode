import java.util.ArrayList;
import java.util.Scanner;

public class TimelyOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		ArrayList<Integer> arX=new ArrayList<Integer>(q);
		ArrayList<Integer> arT=new ArrayList<Integer>(q);
		while(q-->0){
			int num=sc.nextInt();
			if(num==1){
				int X=sc.nextInt();
				int T=sc.nextInt();
				arX.add(X);
				arT.add(T);
			}
			else if(num==2){
				int K=sc.nextInt();
				int T=sc.nextInt();
				K=T-K;
				if(K<0){
					K=0;
				}
				int sum=0;
				for(int i=0;i<arX.size();i++){
					if(arT.get(i)>=K && arT.get(i)<=T){
						sum+=arX.get(i);
					}
				}
				System.out.println(sum);
			}
		}
	}

}
