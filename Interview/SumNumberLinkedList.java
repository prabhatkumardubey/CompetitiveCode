import java.util.Scanner;

class SumNumberLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		DLinkedList dll1=new DLinkedList();
		int ct1=0;
		int ct2=0;
		while(num1>0){
			dll1.add(num1%10);
			num1/=10;
			ct1++;
		}
		DLinkedList dll2=new DLinkedList();
		while(num2>0){
			dll2.add(num2%10);
			num2/=10;
		}
		DLinkedList sum=reverseLinkedList(dll1,dll2,ct1,ct2);
		for(int i=0;i<sum.size();i++){
			System.out.print(sum.remove()+" ");
		}
	}

	private static DLinkedList reverseLinkedList(DLinkedList dll1, DLinkedList dll2, int ct1, int ct2) {
		// TODO Auto-generated method stub
		DLinkedList sum=new DLinkedList();
		int num1=0;
		int num2=0;
		for(int i=0;i<ct1;i++){
			num1=((int)dll1.remove())*10+num1;
		}
		for(int i=0;i<ct2;i++){
			num2=((int)dll2.remove())*10+num2;
		}
		int total=num1+num2;
		while(total>0){
			sum.add(total%10);
			total/=10;
		}
		return sum;
	}

}
