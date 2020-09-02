import java.util.Scanner;

public class BearAndFindingCriminals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		a--;
		int index=a;
		int count=0;
		int no=0;
		int left=0;
		int right=0;
		while(right<n || left>0){
			left=a-count;
			right=a+count;
			if(left>=0 && right<n){
				if(arr[left]!=0 && arr[right]!=0){
					if(left==right){
						no+=arr[left];
					}
					else{
						no+=arr[left];
						no+=arr[right];
					}
				}
				
			}
			else if(left<0 && right<n){
				if(arr[right]>0){
					no+=arr[right];
				}
			}
			else if(left>=0 && right>n-1){
				if(arr[left]>0){
					no+=arr[left];
				}
			}
			count++;
		}
		System.out.println(no);
	}

}
