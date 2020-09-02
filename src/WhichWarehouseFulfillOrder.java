import java.util.Scanner;

class WhichWarehouseFulfillOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int B=sc.nextInt();
		int P=sc.nextInt();
		int ware[][]=new int[W][P];
		int order[][]=new int[B][P];
		for(int i=0;i<W;i++){
			for(int j=0;j<P;j++){
				ware[i][j]=sc.nextInt();
			}
		}
		int count=0;
		int big=0;
		int check=0;
		for(int i=0;i<B;i++){
			count=0;
			big=0;
			check=0;
			for(int j=0;j<P;j++){
				order[i][j]=sc.nextInt();
				int sum=0;
				count=0;
				for(int k=0;k<W;k++){
					sum+=ware[k][j];
					if(sum<=order[i][j]){
						count++;
					}
				}
				if(big<count){
					big=count;
				}
				if(sum<order[i][j]){
					check=1;
				}
			}
			if(check==1){
				System.out.println(-1);
			}
			else{
				System.out.println(big);
			}
		}
	}

}
