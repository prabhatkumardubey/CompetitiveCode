import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      double tip=(double)((M*(double)T)/100);
      double tax=(double)((double)((double)X*M)/100);
      double finalamt=(double)(M+tip+tax);
      // Run some computations....
      
       int total = (int) Math.round(finalamt);
      System.out.print("The final price of the meal is $"+total+".");
      // ...then print!
      
    }
}
