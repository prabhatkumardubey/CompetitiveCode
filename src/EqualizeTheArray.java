import java.util.Scanner;

class EqualizeTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int countAr[]=new int[101];
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
			countAr[arr[i]]++;
		}
		int big=0;
		int num=0;
		for(int i=0;i<101;i++){
			if(big<countAr[i]){
				big=countAr[i];
				num=i;
			}
		}
		big=0;
		for(int i=0;i<N;i++){
			if(num!=arr[i]){
				big++;
			}
		}
		System.out.println(big);
	}

}
