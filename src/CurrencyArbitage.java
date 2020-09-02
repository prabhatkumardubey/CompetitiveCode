import java.util.Scanner;

class CurrencyArbitage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		double amt=100000;
		while(T-->0){
			amt=100000;
			double eur=sc.nextDouble();
			double gbp=sc.nextDouble();
			double usd=sc.nextDouble();
			amt=amt/eur/gbp/usd-100000;
			//amt=amt/gbp;
			//amt=amt/usd;
			if(amt<0){amt=0;}
			System.out.println(Math.floor(amt));
		}
	}

}
