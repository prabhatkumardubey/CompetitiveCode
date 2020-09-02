import java.util.Scanner;

class DivideLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		DLinkedList dll=new DLinkedList();
		for(int i=0;i<n;i++){
			dll.add(sc.nextInt());
		}
		int x=sc.nextInt();
		DLinkedList small=new DLinkedList();
		DLinkedList large=new DLinkedList();
		for(int i=0;i<n;i++){
			int data=(int) dll.get(i);
			if(data<x){
				small.add(data);
			}
			else if(data>=x){
				large.add(data);
			}
		}
		System.out.println("Small");
		for(int i=0;i<small.size();i++){
			System.out.print(small.get(i) +" ");
		}
		System.out.println("\nLarge");
		for(int i=0;i<large.size();i++){
			System.out.print(large.get(i)+" ");
		}
	}

}
