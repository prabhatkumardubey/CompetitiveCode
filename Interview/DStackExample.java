import java.util.Scanner;

//import java.util.LinkedList;

class DStackExample {
	private static Scanner sc;
	public static void main(String args[]){
		DStack ds=new DStack();
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ds.push(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			System.out.print(ds.pop()+" ");
		}
	}
}
class DStack{
	DLinkedList stack;
	int count;
	public DStack(){
		stack=new DLinkedList();
		count=0;
	}
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	public int size(){
		return stack.size();
	}
	public void push(Object n){
		stack.add(n);
		count++;
	}
	public Object pop(){
		count--;
		return stack.remove();
	}
	public Object peek(){
		return stack.get(count);
	}
}
