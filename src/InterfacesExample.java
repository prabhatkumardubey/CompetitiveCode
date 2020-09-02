import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic
{

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=(n);i++)
		{
			sum+=n%i==0?i:0;
		}
		return sum;
	}
	
}

public class InterfacesExample {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator2(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
