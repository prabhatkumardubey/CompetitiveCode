import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//string s1 is rotation of s2
class CheckRotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder s1=new StringBuilder(br.readLine());
			StringBuilder s2=new StringBuilder(br.readLine());
			if(checkRotation(s1,s2))
			{
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

	private static boolean checkRotation(StringBuilder s1, StringBuilder s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()){return false;}
		int l=s1.length();
		for(int i=0;i<l;i++){
			if(s1.charAt(i)!=s2.charAt(l-1-i)){
				return false;
			}
		}
		return true;
	}
}
