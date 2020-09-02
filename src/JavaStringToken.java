import java.util.ArrayList;
import java.util.Scanner;

class JavaStringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s=scan.next();
        if(s.equals("")){
            System.out.println(0);
        }
        else{
        if(scan.hasNext())
            s+=scan.nextLine();
        
            String delims="[ !.,?_'@]+";
            String ars[]=s.split(delims);
            System.out.println(ars.length);
            for(int i=0;i<ars.length;i++){
                System.out.println(ars[i]);
            }
        }
	}

}
