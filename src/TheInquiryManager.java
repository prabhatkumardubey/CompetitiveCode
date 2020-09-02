import java.util.ArrayList;
import java.util.Scanner;

class TheInquiryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> arP=new ArrayList<Integer>();
		ArrayList<Integer> arT=new ArrayList<Integer>();
		while(N-->0){
			int num=sc.nextInt();
			if(num==1){
				int P=sc.nextInt();
				int T=sc.nextInt();
				arP.add(P);
				arT.add(T);
			}
			else if(num==2){
				int T=sc.nextInt();
				int max=0;
				int start=0;
				if(T<60){
					start=0;
				}
				else{
					start=T-60+1;
				}
				int count=0;
				for(int i=0;i<arT.size();i++){
					if(arT.get(i)>=start && arT.get(i)<=T){
						count++;
						if(max<arP.get(i)){
							max=arP.get(i);
						}
					}
				}
				if(count==0){
					System.out.println(-1);
				}
				else{
					System.out.println(max);
				}
			}
		}
	}
}
