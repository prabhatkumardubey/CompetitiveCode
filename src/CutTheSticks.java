import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int ct=n;
        int min=0;
        do{
        	min=getMin(arr,n);
        	System.out.println(ct);
        	for(int i=0;i<n;i++){
        		arr[i]-=min;
        		if(arr[i]<0){
        			arr[i]=0;
        		}
        	}
        	ct=checkNonZeroElements(arr,n);
        }while(ct>0);
	}

	static int getMin(int[] arr, int n) {
		// TODO Auto-generated method stub
		int min=1001;
		for(int i=0;i<n;i++){
			if(arr[i]<min && arr[i]!=0){
				min=arr[i];
			}
		}
		return min;
	}

	static int checkNonZeroElements(int[] arr, int ct) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<ct;i++){
			if(arr[i]>0){
				count++;
			}
		}
		return count;
	}

}
