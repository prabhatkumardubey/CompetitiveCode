import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BeautifulBinaryString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int l=Integer.parseInt(br.readLine());
		StringBuilder str=new StringBuilder(br.readLine());
		int ct=0;
		for(int i=0;i<l-2;i++){
			if(str.charAt(i)=='0' && str.charAt(i+1)=='1' && str.charAt(i+2)=='0'){
				str.setCharAt(i+2, '1');
				i=0;
				ct++;
			}
		}
		System.out.println(ct);
	}

}
