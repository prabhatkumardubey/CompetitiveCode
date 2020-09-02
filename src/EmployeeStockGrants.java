import java.util.Scanner;

class EmployeeStockGrants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int rating[]=new int[N];
		int min[]=new int[N];
		int temprat=100001;
		for(int i=0;i<N;i++){
			rating[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			min[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			temprat=0;
			for(int j=i-11;j<i+10 && j<N;j++){
				int ratmin=rating[i];
				int k=i-11;
				if(k<0){k=0;}
				for(;k<i+10 && k<N;k++){
					if(rating[k]<ratmin && temprat<rating[k]){
						ratmin=rating[k];
					}
				}
				temprat=ratmin;
				int max=0;
				k=i-11;
				if(k<0){k=0;}
				for(;k<i+10 && k<N;k++){
					if(rating[k]==ratmin){
						if(max<min[k]){
							max=min[k];
						}
					}
				}
				max++;
				ratmin=100001;
				k=i-11;
				if(k<0){k=0;}
				for(;k<i+10 && k<N;k++){
					if(rating[k]<ratmin && temprat<rating[k]){
						ratmin=rating[k];
					}
				}
				temprat=ratmin;
				k=i-11;
				if(k<0){k=0;}
				for(;k<i+10 && k<N;k++){
					if(temprat==rating[k]){
						min[k]=max;
					}
				}
				k=i-11;
				if(k<0){k=0;}
				System.out.println("hell "+i+" "+j);
				for(;k<i+11 && k<N;k++){
					System.out.print(min[k]+" ");
				}
				System.out.println();
				
			}
		}
		int sum=0;
		for(int i=0;i<N;i++){
			sum+=min[i];
			System.out.print(min[i]+" ");
		}
		System.out.println();
		System.out.println(sum);
	}

}
