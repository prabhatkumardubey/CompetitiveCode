import java.util.Scanner;

class GCDRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("GCD = "+gcd(a,b));
	}
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
	}
}
