import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoesItFit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String strsplit[]=str.split(" ");
		int W=Integer.parseInt(strsplit[0]);
		int H=Integer.parseInt(strsplit[1]);
		int N=Integer.parseInt(br.readLine());
		while(N-->0){
			str=br.readLine();
			strsplit=str.split(" ");
			if(strsplit[0].equals("C")){
				int r=Integer.parseInt(strsplit[1]);
				if(2*r<=W && 2*r<=H){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else if(strsplit[0].equals("R")){
				int w=Integer.parseInt(strsplit[1]);
				int h=Integer.parseInt(strsplit[2]);
				if(w<=W && h<=H){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}
		
	}

}
