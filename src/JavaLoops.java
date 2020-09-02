import java.util.Scanner;

class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++){
				sum=a;
				for(int j=0;j<=i;j++){
					sum+=Math.pow(2, j)*b;
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
