import java.util.Scanner;

class SherlockAndSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			while(T-->0){
				int a=sc.nextInt();
				int b=sc.nextInt();
				int count=0;
                int root=(int) Math.sqrt(a);
                int sqroot=root*root;
				do{
                    if(sqroot>=a && sqroot<=b){
                        count++;
                    }
					root++;
                    sqroot=(root*root);
				}while(sqroot>=a && sqroot<=b);
				System.out.println(count);
			}
	}

}
