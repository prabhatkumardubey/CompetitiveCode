import java.util.LinkedList;
import java.util.Scanner;

class Example {
	public static void main(String args[]){
		LinkedList<Integer> ll=new LinkedList<Integer>();
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			ll.add(new Scanner(System.in).nextInt());
		}
		ll.remove(2);
		for(int i=0;i<n-1;i++){
			System.out.println(ll.get(i));
		}
	}
}
