import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos=0.0;
        double neg=0.0;
        double zero=0.0;
        int countpos=0;
        int countneg=0;
        int countzero=0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                countpos++;
            else if(arr[arr_i]<0)
                countneg++;
            else
                countzero++;
        }
        //System.out.println(countpos+" he "+countneg+" "+countzero);
        DecimalFormat df=new DecimalFormat("0.######");
		df.setRoundingMode(RoundingMode.DOWN);
        System.out.println(Double.valueOf(df.format((double)countpos/n)));
        System.out.println(Double.valueOf(df.format((double)countneg/n)));
        System.out.println(Double.valueOf(df.format((double)countzero/n)));
    }
}
