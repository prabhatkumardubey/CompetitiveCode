
class DetectLoopInLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
			next=null;
		}
	}
	public void pushData(int d){
		Node n=new Node(d);
		n.next=head;
		head=n;
	}
	private int detectLoop() {
		// TODO Auto-generated method stub
		Node slow=head,fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("Found Loop");
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoopInLinkedList ll=new DetectLoopInLinkedList();
		ll.pushData(20);
		ll.pushData(4);
		ll.pushData(15);
		ll.pushData(10);
		//ll.head.next.next.next.next=ll.head;
		int num=ll.detectLoop();
	}
}
