import java.util.Scanner;

class GiveMeTheOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		int M=sc.nextInt();
		int a=0,b=0;
		int temp=0;
		for(int i=0;i<M;i++){
			a=sc.nextInt();
			b=sc.nextInt();
			a--;
			b--;
			int count=0;
			for(int j=a;j<=b;j++){
				temp=arr[j];
				for(int k=j;k>count;k--){
					arr[k]=arr[k-1];
				}
				arr[count++]=temp;
			}
		}
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
