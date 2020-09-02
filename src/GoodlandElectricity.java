import java.util.Scanner;

class GoodlandElectricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int electric[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int ct=0,temp=0;
		int low=0;
		int high=n-1;
		while(low<high){
			if(arr[low]==1) {
				int left=low-k;
                int right=low+k;
                temp=0;
                for(;left<=right;left++){
                    if(left>=0 && left<n){
                        if(arr[left]!=-1){
                            arr[left]=-1;
                            temp=1;
                        }
                    }
                }
                if(temp==1){
                    ct++;
                }
            }
			//high
			if(arr[high]==1) {
				int left=high-k;
                int right=high+k;
                temp=0;
                for(;left<=right;left++){
                    if(left>=0 && left<n){
                        if(arr[left]!=-1){
                            arr[left]=-1;
                            temp=1;
                        }
                    }
                }
                if(temp==1){
                    ct++;
                }
            }
			low++;
			high--;
		}
		temp=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=-1){
				temp=1;
			}
		}
		if(temp==0){
			System.out.println(ct);
		}
		else{
			System.out.println(-1);
		}
	}

}
