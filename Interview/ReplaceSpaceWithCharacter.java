import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReplaceSpaceWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder str=new StringBuilder(br.readLine());
			System.out.println(replaceCharacter(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static StringBuilder replaceCharacter(StringBuilder str) {
		// TODO Auto-generated method stub
		int length=str.length();
		for(int i=0;i<length;i++){
			if(str.charAt(i)!=' '){
				break;
			}
			else{
				str.deleteCharAt(i);
				length=str.length();
			}
		}
		for(int i=length-1;i>0;i++){
			if(str.charAt(i)!=' '){
				break;
			}
			else{
				str.deleteCharAt(i);
				length=str.length();
			}
		}
		for(int i=0;i<length;i++){
			if(str.charAt(i)==' '){
				str.deleteCharAt(i);
				str.insert(i, "%20");
				i+=2;
				length=str.length();
			}
		}
		return str;
	}

}
