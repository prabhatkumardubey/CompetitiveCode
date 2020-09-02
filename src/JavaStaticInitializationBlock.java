import java.util.Scanner;

public class JavaStaticInitializationBlock {
	static int B=0,H=0;
	static boolean flag=false;
	static{
		Scanner sc=new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		if(B>0 && H>0){
			flag=true;
		}
		else{
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
