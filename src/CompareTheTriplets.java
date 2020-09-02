import java.util.Scanner;

class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int alice=0,bob=0;
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++){
			b[i]=sc.nextInt();
			if(a[i]<b[i]){
				bob++;
			}
			else if(a[i]>b[i]){
				alice++;
			}
		}
		System.out.println(alice+" "+bob);
	}

}
