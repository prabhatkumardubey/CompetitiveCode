import java.util.Scanner;

public class CombinationLock {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int narr[]=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		int ct=0;
		for(int i=0;i<5;i++){
			narr[i]=sc.nextInt();
			if((narr[i]-arr[i])==0){
				continue;
			}
			else{
				int dif=Math.abs(arr[i]-narr[i]);
				if(dif>5){
					ct+=(10-dif);
				}
				else{
					ct+=dif;
				}
			}
		}
		System.out.println(ct);
	}
}
