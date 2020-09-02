import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abbreviation {
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(br.readLine());
		while(q-->0){
			StringBuilder str1=new StringBuilder(br.readLine());
			StringBuilder str2=new StringBuilder(br.readLine());
			for(int i=0,j=0;i<str1.length() && j<str2.length();i++){
				if(str1.charAt(i)== str2.charAt(j)){
					j++;
				}
				else if((str1.charAt(i)-32) == str2.charAt(j)){
					str1.setCharAt(i, str2.charAt(j));
					j++;
				}
			}
			if(str1.length()>str2.length()){
				for(int i=0;i<str1.length();i++){
					if(str1.charAt(i)>=97 && str1.charAt(i)<=122){
						str1.deleteCharAt(i);
						i--;
					}
				}
			}
			int temp=0;
			if(str1.length()!=str2.length()){
				temp=1;
			}
			else{
				for(int i=0;i<str1.length();i++){
					if(str1.charAt(i)!=str2.charAt(i)){
						temp=1;
						break;
					}
				}
			}
			if(temp==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
