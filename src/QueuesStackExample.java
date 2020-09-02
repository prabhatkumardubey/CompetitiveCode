import java.util.*;

class Palindrome {

	LinkedList<Character> queue;
	Stack<Character> stk;
	public Palindrome()
	{
		queue = new LinkedList<Character>();
		stk=new Stack<Character>();
	}
	
	public void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		queue.addLast(c);
	}
    //Write your code here

	public Object popCharacter() {
		// TODO Auto-generated method stub
		return stk.pop();
	}

	public Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return queue.remove(0);
	}

	public void pushCharacter(char c) {
		// TODO Auto-generated method stub
		stk.push(c);
	}

}

public class QueuesStackExample {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}
