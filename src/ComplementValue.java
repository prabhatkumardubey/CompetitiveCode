import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class ComplementValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N;
		try {
			N = Integer.parseInt(br.readLine());
			System.out.println(getComplement(N));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	static int getComplement(int n) {
		// TODO Auto-generated method stub
		int dup=n;
		int rem=0;
		String str="";
		while(dup>0){
			rem=(dup%2);
			if(rem==0){
				str=1+str;
			}
			else{
				str=0+str;
			}
			dup/=2;
		}
		dup=0;
		int count=0;
		for(int i=str.length()-1;i>=0;i--,count++){
			dup+=(int) (Integer.parseInt(""+str.charAt(i))*(Math.pow(2,count )));
		}
		return dup;
	}

}
