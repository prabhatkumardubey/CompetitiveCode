import java.util.LinkedList;
import java.util.Scanner;

class TC_SRM_692_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String S="ebbe";
		//int arr[]={5,2,11,1};
		//System.out.println(findAnnoyance(S,arr));
		//12
		String S="bbeebeebeeeebbb";
		int arr[]={58,517,301,524,79,375,641,152,810,778,222,342,911,313,336};
		System.out.println(findAnnoyance(S,arr));
		//20485
		/*String S="bbbbb";
		int arr[]={1,1,1,1,1};
		System.out.println(findAnnoyance(S,arr));
		//10
		String S="bee";
		int arr[]={50,40,30};
		System.out.println(findAnnoyance(S,arr));
		//0
		*/
	}
	public static int findAnnoyance(String S, int[] a)
	{
		int sum=0;
		for(int i=0;i<S.length();i++){
			if(S.charAt(i)=='b'){
				for(int j=i+1;j<S.length();j++){
					if(S.charAt(j)=='b'){
						sum+=a[j];
					}
				}
			}
		}
		return sum;
		
	}

}
