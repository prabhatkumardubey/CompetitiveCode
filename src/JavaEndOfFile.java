import java.util.Scanner;

class JavaEndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNext()){
			String s=sc.nextLine();
			System.out.println(count+" "+s);
			count++;
		}
	}

}
