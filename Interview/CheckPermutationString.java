import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheckPermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder s1=new StringBuilder(br.readLine());
			StringBuilder s2=new StringBuilder(br.readLine());
			if(checkPermutation(s1,s2)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static boolean checkPermutation(StringBuilder s1, StringBuilder s2) {
		// TODO Auto-generated method stub
		int l1=s1.length();
		int l2=s2.length();
		int temp=0;
		if(l1==l2){
			for(int i=0;i<l1;i++){
				int ct1=0;
				int ct2=0;
				for(int j=0;j<l1;j++){
					if(s1.charAt(i)==s1.charAt(j)){
						ct1++;
					}
				}
				for(int j=0;j<l2;j++){
					if(s1.charAt(i)==s2.charAt(j)){
						ct2++;
					}
				}
				if(ct1!=ct2){
					temp=1;
					break;
				}
			}
		}
		if(temp==1){
			return false;
		}
		else{
			return true;
		}
	}
	

}
