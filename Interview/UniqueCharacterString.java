import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UniqueCharacterString {
	public static char arr[]=new char[256];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder str=new StringBuilder(br.readLine());
			if(hasUnique(str)){
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

	private static boolean hasUnique(StringBuilder str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++){
			if(arr[(byte)str.charAt(i)]==(str.charAt(i))){
				return false;
			}
			else{
				arr[(byte) (str.charAt(i))]=str.charAt(i);
			}
		}
		return true;
	}

}
