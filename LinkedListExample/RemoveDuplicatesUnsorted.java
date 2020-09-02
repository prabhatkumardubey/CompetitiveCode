import java.util.LinkedList;
import java.util.Scanner;

class RemoveDuplicatesUnsorted {
	static LinkedList<Integer> list=new LinkedList<Integer>();
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		getElement(n);
		for(int i=0;i<list.size();i++){ 
			for(int j=0;j<list.size();j++){
				if(i!=j && list.get(j)==list.get(i)){
					list.remove(j);
				}
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	private static void getElement(int n) {
		// TODO Auto-generated method stub
		list.add(sc.nextInt());
		if(n>0){
			getElement(--n);
		}
		else{
			return;
		}
	}

}
