import java.util.Scanner;

class NokiaLargestVolume
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		double s=(double)(h)*(double)(h)+(double)(r)*(double)(r);
		//double s=(double)h(double)(Math.sqrt(2));
		double R=(double)(r)+(double)Math.sqrt((double)s*(double)s+(double)h*(double)(h));
		double volume=((double)(3.14)/(double)(3));
		volume=(volume*(double)(h))*(double)((R*R)+((double)r*(double)r)+(R*(double)r));
		System.out.println(String.format("%.2f", volume));
	}
}