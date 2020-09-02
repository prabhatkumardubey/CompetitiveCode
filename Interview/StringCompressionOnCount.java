import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringCompressionOnCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			StringBuilder str=new StringBuilder(br.readLine());
			StringBuilder newstr=new StringBuilder("");
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				int count=0;
				for(int j=i;j<str.length();j++){
					if(ch==str.charAt(j)){
						count++;
						i=j;
					}
				}
				newstr.append(ch+""+count);
			}
			System.out.println(newstr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
