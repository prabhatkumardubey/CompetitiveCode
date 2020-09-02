import java.util.Scanner;

class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int count=0;
			int N=sc.nextInt();
			int K=sc.nextInt();
			for(int i=0;i<N;i++){
				int num=sc.nextInt();
				if(num<=0){
					System.out.println(num);
					count++;
				}
			}
			if(count>=K){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
		}
	}

}
