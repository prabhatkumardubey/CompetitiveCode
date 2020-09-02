import java.util.Scanner;

class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int count=0;
            int temp=0;
            int ct=0;
            while(n>=c){
            	count+=temp=n/c;
            	n=n%c;
            	temp+=ct;
            	n+=(temp/m)*c;
            	ct=temp%m;
            }
            System.out.println(count);
        }
	}

}
