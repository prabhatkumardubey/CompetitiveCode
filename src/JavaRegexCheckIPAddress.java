import java.util.Scanner;

class JavaRegexCheckIPAddress {
	public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}
class myRegex{

	public static String pattern="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]).(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	
}
