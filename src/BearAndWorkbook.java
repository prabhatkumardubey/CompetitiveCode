import java.util.Scanner;

class BearAndWorkbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int pg=0;
        int ct=0;
		int count=0;
		for(int i=0;i<n;i++){
			ct=0;
			pg++;
			for(int j=1;j<=arr[i];j++){
				if(ct>k-1){
                    pg++;
                    ct=0;
                }
                if(j==pg){
					count++;
				}
                ct++;
                
			}
		}
		System.out.println(count);
	}

}
