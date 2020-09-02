import java.util.Scanner;

class PointOnALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ct1=0;
		int ct2=0;
		int temp1=0;
		int temp2=0;
		int x=sc.nextInt();
		int y=sc.nextInt();
		temp1=x;
		temp2=y;
		N--;
		while(N-->0){
			x=sc.nextInt();
			y=sc.nextInt();
			if(x!=temp1){
				ct1++;
			}
			if(y!=temp2){
				ct2++;
			}
		}
		if(ct1==0 || ct2==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
