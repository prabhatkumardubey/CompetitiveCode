import java.util.ArrayList;
import java.util.Scanner;

class MatchTheShoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int M=sc.nextInt();
		int N=sc.nextInt();
		int ar[]=new int[N];
		int no[]=new int[M];
		int rank[]=new int[M];
		int count=0;
		for(int i=0;i<N;i++){
			ar[i]=sc.nextInt();
			int temp=0;
			for(int j=0;j<count;j++){
				if(no[j]==ar[i]){
					rank[j]++;
					temp=1;
					break;
				}
			}
			if(temp==0){
				no[count]=ar[i];
				rank[count]=1;
				count++;
			}
		}
		int index=0;
		int temp=0;
		for(int i=0;i<M;i++){
			int big=rank[i];
			for(int j=0;j<M;j++){
				if(rank[i]<rank[j]){
					temp=rank[i];
					rank[i]=rank[j];
					rank[j]=temp;
					temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
				else if(rank[i]==rank[j]){
					if(no[i]>no[j]){
						temp=rank[j];
						rank[j]=rank[i];
						rank[i]=temp;
						temp=no[i];
						no[i]=no[j];
						no[j]=temp;
					}
				}
			}
		}
		count=M-1;
		for(int i=0;i<K;i++){
			System.out.println(no[count--]);
		}
	}

}
