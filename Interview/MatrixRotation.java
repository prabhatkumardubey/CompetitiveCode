import java.util.Scanner;

//matrix rotation by 90 degree
class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[][]=new int[N][N];
		int newarr[][]=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				newarr[j][N-i-1]=arr[i][j];
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(newarr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
