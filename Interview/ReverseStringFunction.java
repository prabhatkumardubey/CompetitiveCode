import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create string reverse function without using library or array.
class ReverseStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			//System.out.println(reverseString(str));
			System.out.println(reverseStr(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//if array is not used but library used
	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		if(str.length()==0){
			return "";
		}
		return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	}
	//if string library is not used than we can create new stringbuilder
	private static String reverseStr(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
}
