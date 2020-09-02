import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifferenceMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum1=0,sum2=0;
        int ri=0,rj=n-1;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                	sum1+=a[a_i][a_j];
                if(ri==a_i && rj==a_j)
                {
                	sum2+=a[a_i][a_j];
                	ri++;
                	rj--;
                }
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
