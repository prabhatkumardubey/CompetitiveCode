import java.util.Scanner;

class ColorCode {
	static char ch[]={'0','1','2','3','4','5','6','7','8','9','U','V','W','X','Y','Z'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
			int R=sc.nextInt();
			int G=sc.nextInt();
			int B=sc.nextInt();
			int rR=R%16;
			int qR=R/16;
			int rG=G%16;
			int qG=G/16;
			int rB=B%16;
			int qB=B/16;
			System.out.println("Case "+i+": "+ch[qR]+""+ch[rR]+" "+ch[qG]+ch[rG]+" "+ch[qB]+ch[rB]);
		}
	}

}
