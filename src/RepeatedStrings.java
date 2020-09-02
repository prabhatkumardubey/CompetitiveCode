import java.util.Scanner;

public class RepeatedStrings {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        StringBuilder rs=new StringBuilder();
        long rem=n/(s.length());
        long r=n%(s.length());
        long ct=0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='a'){
        		ct++;
        	}
        }
        long count=0;
        if(s.length()==1 && ct==1){
        	count=n;
        }
        else if(s.length()==1 && ct==0){
        	count=0;
        }
        else{
	        /*for(long i=0;i<rem;i++){
	        	rs.append(s);
	        	count+=ct;
	        }*/
        	count+=(ct*rem);
	        for(int i=0;i<r;i++){
	        	if(s.charAt(i)=='a'){
	        		count++;
	        	}
	        }
        }
        System.out.println(count);
    }
}
