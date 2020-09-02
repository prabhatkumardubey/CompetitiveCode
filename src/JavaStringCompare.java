import java.util.Scanner;

class JavaStringCompare {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		int l=str.length();
		String minsub=str.substring(0,k);
		for(int i=0;i<l-k+1;i++){
			String sub2=str.substring(i,i+k);
			if(minsub.compareTo(sub2)>0){
				minsub=sub2;
			}
		}
		String maxsub=str.substring(0,k);
		for(int i=0;i<l-k+1;i++){
			String sub2=str.substring(i,i+k);
			if(maxsub.compareTo(sub2)<0){
				maxsub=sub2;
			}
		}
		System.out.println(minsub);
		System.out.println(maxsub);
	}
}
