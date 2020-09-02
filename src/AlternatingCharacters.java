import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0){
			StringBuilder str=new StringBuilder(br.readLine());
			int l=str.length();
			int ct=0;
			for(int i=0;i<l-1;i++){
				if(str.charAt(i)==str.charAt(i+1)){
					str.deleteCharAt(i+1);
					l=str.length();
					ct++;
					i--;
				}
			}
			System.out.println(ct);			
		}
	}

}
