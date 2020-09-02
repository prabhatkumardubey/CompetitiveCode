import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int N=Integer.parseInt(br.readLine());
			StringBuilder S=new StringBuilder(br.readLine());
			int K=Integer.parseInt(br.readLine());
			for(int i=0;i<N;i++){
				char ch=S.charAt(i);
				if((ch>=65 && ch<=90)){
					ch+=K;
					while(ch>90){
						ch=(char)('A'+(ch-91));
					}
				}
				else if(ch>=95 && ch<=122){
					ch+=K;
					while(ch>122){
						ch=(char)('a'+(ch-123));
					}
				}
				System.out.print(ch);
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
