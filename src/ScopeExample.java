import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
  		elements=a;
	}
	private int[] elements;
  	public int maximumDifference;
	public void computeDifference() {
		// TODO Auto-generated method stub
		int dif=0;
		for(int i=0;i<elements.length;i++)
		{
			for(int j=i+1;j<elements.length;j++)
			{
				dif=elements[i]-elements[j];
				dif=dif<0?(dif*-1):dif;
				maximumDifference=dif>maximumDifference?dif:maximumDifference;
			}
		}
	}
}
public class ScopeExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Difference D = new Difference(a);
        D.computeDifference();
        System.out.print(D.maximumDifference);
	}
}