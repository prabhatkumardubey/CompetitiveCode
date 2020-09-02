import java.util.Scanner;

class DeleteNodeMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DLinkedList dll=new DLinkedList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			dll.add(sc.nextInt());
		}
		int num=sc.nextInt();
		dll.addIndex(num, n/2);
		for(int i=0;i<n+1;i++){
			System.out.print(dll.get(i)+" ");
		}
	}

}
