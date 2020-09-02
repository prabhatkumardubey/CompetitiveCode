import java.util.Scanner;

public class BearAndFiveCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=0;
		int big=0;
		int num=0;
		int rank[]=new int[5];
		for(int i=0;i<5;i++){
			//System.out.println(a[i]);
			count=1;
			for(int j=0;j<5;j++){
				if(i!=j && a[i]==a[j]){
					count++;
				}
			}
			rank[i]=count;
		}
		int fin=sum;
		sum=0;
		count=0;
		big=0;
		for(int i=0;i<5;i++){
			//System.out.println(rank[i]+" "+a[i]);
			if(rank[i]>=3){
				sum=a[i]*3;
				//System.out.println(sum);
			}
			else if(rank[i]==2){
				sum=a[i]*2;
				//System.out.println(sum);
			}
			
			if(big<sum){
				big=sum;
			}
		}
		fin=fin-big;
		System.out.print(fin);
	}

}
