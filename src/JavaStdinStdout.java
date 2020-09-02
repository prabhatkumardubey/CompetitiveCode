import java.util.Scanner;

public class JavaStdinStdout {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            double y=sc.nextDouble();
            String s=sc.nextLine();
        if(sc.hasNext()){
            s+=sc.nextLine();
        }
            //Complete this code

            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}
