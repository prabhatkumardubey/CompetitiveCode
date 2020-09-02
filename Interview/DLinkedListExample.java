import java.util.Scanner;

class DLinkedListExample{
	private static Scanner sc;
	public static void main(String args[]){
		DLinkedList dll=new DLinkedList();
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			dll.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			System.out.print(dll.get(i)+" ");
		}
		System.out.println();
		System.out.println("Enter 1 to remove :");
		if(sc.nextInt()==1){
			dll.remove();
			n--;
		}
		for(int i=0;i<n;i++){
			System.out.print(dll.get(i)+" ");
		}
		System.out.println();
		System.out.println("Enter 2 to add :");
		if(sc.nextInt()==2){
			dll.add(sc.nextInt());
			n++;
		}
		for(int i=0;i<n;i++){
			System.out.print(dll.get(i)+" ");
		}
		System.out.println();
	}
}
class DLinkedList {
	DNode head;
	int count;
	public DLinkedList(){
		head=null;
		count=-1;
	}
	public DLinkedList(DNode newHead){
		head=newHead;
		count=1;
	}
	public void add(Object newData){
		DNode temp=new DNode(newData);
		if(count==-1){
			head=temp;
			count++;
		}
		else{
		DNode current=head;
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(temp);
		count++;
		}
	}
	public void addIndex(Object data, int index){
		if(index==0){
			head.next=head;
			head.data=data;
			count++;
			return;
		}
		DNode newNode=new DNode(data);
		DNode current=head;
		for(int i=0;i<index-1;i++){
			current=current.getNext();
		}
		newNode.next=current.getNext();
		current.next=newNode;
		count++;
	}
	public Object get(int index){
		if(index<0){
			return -1;
		}
		DNode current=head;
		for(int i=0;i<index;i++){
			current=current.getNext();
		}
		return current.getData();
	}
	public int size(){
		return count+1;
	}
	public boolean isEmpty(){
		return head==null;
	}
	public Object remove(){
		DNode current=head;
		if(count==0){
			Object d= head.data;
			head=null;
			count=-1;
			return d;
		}
		while(current.getNext().getNext()!=null){
			current=current.getNext();
		}
		Object d=current.getNext().getData();
		current.setNext(null);
		count--;
		return d;
	}
	public Object removeQueue(){
		DNode current=head;
		if(count==0){
			Object d=head.data;
			head=null;
			count=-1;
			return d;
		}
		else if(count>=1){
			Object d=head.data;
			head=head.getNext();
			count--;
			return d;
		}
		else{
			return -1;
		}
	}
	
}
class DNode{
	Object data;
	DNode next=null;
	public DNode(Object d){
		data=d;
		next=null;
	}
	public DNode(Object newData, DNode newNext){
		data=newData;
		next=newNext;
	}
	public Object getData(){
		return data;
	}
	public DNode getNext(){
		return next;
	}
	public void setData(Object newData){
		data=newData;
	}
	public void setNext(DNode newNext){
		next=newNext;
	}
}
