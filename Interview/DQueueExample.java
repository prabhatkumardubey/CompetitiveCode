
import java.util.Scanner;
class DQueueExample {
	private static Scanner sc;
	public static void main(String args[]){
		DQueue ds=new DQueue();
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ds.enqueue(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			System.out.print(ds.dequeue()+" ");
		}
	}
}
class DQueue{
	DLinkedList queue;
	int count;
	public DQueue(){
		queue=new DLinkedList();
		count=0;
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	public int size(){
		return queue.size();
	}
	public void enqueue(Object n){
		queue.add(n);
		count++;
	}
	public Object dequeue(){
		count--;
		return queue.removeQueue();
	}
	public Object peek(){
		return queue.get(0);
	}
}

