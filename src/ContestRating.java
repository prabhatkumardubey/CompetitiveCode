import java.util.Scanner;

public class ContestRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		while(n-->0){
			String handle=sc.next();
			int before=sc.nextInt();
			int after=sc.nextInt();
			if(before>=2400 && after>before){
				temp=1;
			}
		}
		if(temp==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}
