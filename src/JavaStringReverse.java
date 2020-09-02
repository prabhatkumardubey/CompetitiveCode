import java.util.Scanner;

class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		int temp=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(l-i-1)){
				System.out.println("No");
				temp=1;
				break;
			}
		}
		if(temp==0)
			System.out.println("Yes");
	}

}
