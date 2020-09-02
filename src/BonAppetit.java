import java.util.Scanner;

public class BonAppetit {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int tsum=0,asum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			tsum+=arr[i];
			if(i!=k){
				asum+=arr[i];
			}
		}
		int bcharged=sc.nextInt();
		int bactual=asum/2;
		int diff=bcharged-bactual;
		if(diff==0){
			System.out.println("Bon Appetit");
		}
		else{
			System.out.println(diff);
		}
	}
}
