import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperReducedString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str=new StringBuilder(br.readLine());
		int l=str.length();
		for(int i=0;i<l-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				//System.out.println(str.charAt(i));
				str.delete(i, i+2);
				l=str.length();
				i=-1;
			}
		}
		if(str.length()==0){
			System.out.println("Empty String");
		}
		else{
			System.out.println(str);
		}
	}

}
