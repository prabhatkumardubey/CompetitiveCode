import java.util.Scanner;

class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int aday=sc.nextInt();
		int amonth=sc.nextInt();
		int ayear=sc.nextInt();
		int eday=sc.nextInt();
		int emonth=sc.nextInt();
		int eyear=sc.nextInt();
		int fine=0;
		if(eyear<ayear){
			fine=10000;
		}
		else if(eyear==ayear){
			if(emonth<amonth){
				fine=(amonth-emonth)*500;
			}
			else if(emonth==amonth){
				if(eday<aday){
					fine=(aday-eday)*15;
				}
			}
		}
		System.out.println(fine);
	}

}
