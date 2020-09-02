import java.util.Scanner;

class EasyGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(max<arr[i]){
				max=arr[i];
			}
		}
		int x=0;
		for(int i=2;i<=max;i++){
			int temp=0;
			for(int j=0;j<n;j++){
				if(arr[j]%i!=0){
					temp=1;
					break;
				}
			}
			if(temp==0){
				x=i;
				break;
			}
		}
		int l=0;
		for(int i=k;i>=0;i--){
			if(i%x==0){
				l=i;
				break;
			}
		}
		System.out.println(l);
	}

}
