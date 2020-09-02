import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortExample2{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
     public static void insertIntoSorted(int[] ar) {
        // Fill up this function
    	int j,temp;
    	int n=ar.length;
    	for(int i=0;i<n;i++)
        {
            temp=ar[i];
            j=i;
            while(temp<ar[j-1] && j>0)
            {
                ar[j]=ar[j-1];
                j--;
            }
            ar[j]=temp;
            for(int k=0;k<n;k++)
            {
            	System.out.print(ar[k]+" ");
            }
        }
        
    }
    
    
/* Tail starts here */
     
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
