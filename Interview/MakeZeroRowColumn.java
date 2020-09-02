import java.util.ArrayList;
import java.util.Scanner;

class MakeZeroRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int arr[][]=new int[M][N];
		ArrayList<Integer> row=new ArrayList<Integer>();
		ArrayList<Integer> column=new ArrayList<Integer>();
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==0){
					row.add(i);
					column.add(j);
				}
			}
		}
		for(int i=0;i<row.size();i++){
			for(int j=0;j<N;j++){
				arr[row.get(i)][j]=0;
			}
			for(int j=0;j<M;j++){
				arr[j][column.get(i)]=0;
			}
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
