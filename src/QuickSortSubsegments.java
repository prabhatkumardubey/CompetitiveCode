//using quick sort
import java.util.Scanner;

class QuickSortSubsegments {
	public static long arr[];
	private static int length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int k=sc.nextInt();
		length=n;
		arr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		while(q-->0){
			int start=sc.nextInt();
			int end=sc.nextInt();
			sort(arr,start,end);	
		}
		System.out.println(arr[k]);
	}
	public static void sort(long[] arr2, int start, int end) {
        
        if (arr2 == null || arr2.length == 0) {
            return;
        }
        arr = arr2;
        length = arr2.length;
        quickSort(start, end);
    }
 
    private static  void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        long pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
