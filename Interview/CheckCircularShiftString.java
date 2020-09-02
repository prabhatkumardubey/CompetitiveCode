import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//s1=watterbottle, s2=terbottlewat
class CheckCircularShiftString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder s1=new StringBuilder(br.readLine());
			StringBuilder s2=new StringBuilder(br.readLine());
			if(checkShift(s1,s2)){
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

	private static boolean checkShift(StringBuilder s1, StringBuilder s2) {
		// TODO Auto-generated method stub
		int index=0;
		int temp=0;
		for(int i=0;i<s1.length();i++){
			temp=0;
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					index=j;
					break;
				}
			}
			for(int j=0;j<s1.length();j++,index++){
				if(index==s2.length()){
					index=0;
				}
				if(s1.charAt(j)!=s2.charAt(index)){
					temp=1;
					break;
				}
			}
			if(temp==0){
				return true;
			}
		}
		return false;
	}

}
