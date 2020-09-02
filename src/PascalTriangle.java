import java.util.Scanner;

class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][2*n-1];
		a[0][n-1]=1;
		for(int i=1;i<n;i++){
			for(int j=0;j<(2*n-1);j++){
				if(j==0){
					a[i][j]=a[i-1][j+1];
				}
				else if(j==(2*n-2)){
					a[i][j]=a[i-1][j-1];
				}
				else{
					a[i][j]=a[i-1][j-1]+a[i-1][j+1];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<(2*n-1);j++){
				if(a[i][j]==0){
					System.out.print(" ");
				}
				else{
					System.out.print(a[i][j]);
				}
			}
			System.out.println();
		}
	}

}
