import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class AddFractionNumber {
	public static int num=0,den=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fraction=br.readLine();
		String split[]=fraction.split("/");
		int num1=Integer.parseInt(split[0]);
		int den1=Integer.parseInt(split[1]);
		fraction=br.readLine();
		split=fraction.split("/");
		int num2=Integer.parseInt(split[0]);
		int den2=Integer.parseInt(split[1]);
		addFraction(num1,den1,num2,den2);
		System.out.println(num+"/"+den);
	}
	private static void addFraction(int num1, int den1, int num2, int den2) {
		// TODO Auto-generated method stub
		den=gcd(den1,den2);
		den=(den1*den2)/den;
		num=((den/den1)*num1)+((den/den2)*num2);
		//reduce fraction to simplest form
		reduceFraction();
	}
	private static void reduceFraction() {
		// TODO Auto-generated method stub
		//temp is common factor
		int temp=gcd(num,den);
		den=den/temp;
		num=num/temp;
	}
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0){
			return b;
		}
		return gcd(b%a,a);
	}

}
