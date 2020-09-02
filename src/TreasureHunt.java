import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double ad=(-1.00)*a;
		double bd=b;
		double d=((a*bd)-(b*ad));
		DecimalFormat df=new DecimalFormat("0.############");
		df.setRoundingMode(RoundingMode.UNNECESSARY);
		System.out.println(Double.valueOf(df.format((((bd*x)-(ad*y))/(d)))));
		System.out.println(Double.valueOf(df.format((((((-1)*b)*x)+(a*y))/(d)))));
	}
}
