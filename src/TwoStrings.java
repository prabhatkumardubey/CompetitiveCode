import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			while(T-->0){
				String a=br.readLine();
				String b=br.readLine();
				if(checkCommon(a,b)){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean checkCommon(String a, String b) {
		// TODO Auto-generated method stub
		int limit=0;
		if(a.length()<b.length()){
			limit=a.length();
			int temp=0;
			String str="";
			for(int i=1;i<=limit;i++){
				for(int j=0;j<a.length();j++){
					if(j+i==a.length()-1){
						str=a.substring(j);
					}
					else{
						str=a.substring(j, j+i);
					}
					for(int k=0;k<b.length();k++){
						if(k+i==b.length()-1){
							if(str==b.substring(k)){
								return true;
							}
						}
						else{
							if(str==b.substring(k, k+i)){
								return true;
							}
						}
					}
				}
			}	
		}
		else{
			limit=b.length();
			int temp=0;
			String str="";
			for(int i=1;i<=limit;i++){
				for(int j=0;j+i<b.length();j++){
					if(j+i==(b.length()-1)){
						str=b.substring(j);
					}
					else{
						str=b.substring(j, j+i);
					}
					for(int k=0;k+i<a.length();k++){
						if(k+i==(a.length()-1)){
							if(str==a.substring(k)){
								return true;
							}
						}
						else{
							//System.out.println(k+i+" "+a+" "+k+" "+i+ " "+str);
							if(str==a.substring(k, k+i)){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

}
