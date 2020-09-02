import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

class LinkedListExample {
	public static  Node insert(Node head,int data)
	{
		
		Node n=new Node(data);
		Node current=head;
		while(current.next != null)
		{
			current=current.next;
		}
		return current.next;
	}
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}