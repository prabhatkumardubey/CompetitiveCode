import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class JavaDeque {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
           deque.addLast(num);
        }
        int count=0;
        int check=0;
        Deque deck=deque;
        for(int i=0;i<n;i++){
        	deck=deque;
        	int num=(int) deck.pop();
        	ArrayList<Integer> al=new ArrayList<Integer>();
        	al.add(num);
        	for(int j=1;j<m;j++){
        		al.add((int)deck.pop());
        	}
        	deque.pop();
        }
        System.out.println(count);
    }
}
