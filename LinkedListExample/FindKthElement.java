import java.util.Scanner;

class FindKthElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dup=n;
		System.out.println("Enter the element :");
		NodeList nl=new NodeList(sc.nextInt());
		n--;
		while(n-->0){
			nl.appendElement(sc.nextInt());
		}
		System.out.println("Enter the index of  element :");
		int x=sc.nextInt();
		/*if(dup-x==dup){
			dup=0;
		}
		else{
			dup=dup-x;
		}*/
		NodeList head;
		System.out.println(nl.getElement(x));
	}

}
class NodeList{
	int data;
	NodeList next=null;
	NodeList start=null;
	public NodeList(int d){
		data=d;
		next=null;
	}
	//append element at last
	void appendElement(int d){
		NodeList n=new NodeList(d);
		n.next=start;
		start=n;
	}
	//delete element
	NodeList deleteElement(NodeList head,int d){
		NodeList n=head;
		if(n.data==d){
			return head.next;
		}
		while(n.next!=null){
			if(n.next.data==d){
				n.next=n.next.next;
				return head;
			}
			n=n.next;
			
		}
		return head;
	}
	int getElement(int i){
		NodeList n=start;
		System.out.println(n.data);
		while(i-->0){
			System.out.println(i+" "+n.data);
			n=n.next;
		}
		return n.data;
		
	}
}
