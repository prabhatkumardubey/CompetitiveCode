import java.util.Scanner;

public class JavaAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		char ar[]=a.toCharArray();
		char br[]=b.toCharArray();
		if(a.length()<b.length()){
			for(int i=0;i<ar.length;i++){
				for(int j=0;j<br.length;j++){
					if(ar[i]==br[j]){
						br[j]='_';
                        break;
					}
				}
				ar[i]='_';
			}
			for(int i=0;i<br.length;i++){
				if(br[i]!='_'){
					return false;
				}
			}
		}
		else{
			for(int i=0;i<br.length;i++){
				for(int j=0;j<ar.length;j++){
					if(br[i]==ar[j]){
						ar[j]='_';
                        break;
					}
				}
				br[i]='_';
			}
			for(int i=0;i<ar.length;i++){
				if(ar[i]!='_'){
					return false;
				}
			}
		}
		return true;
	}

}
