import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
   static int lonelyinteger(int[] a) {
      return 0;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        int lonely=-1;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        int count=0;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            count=1;
            for(int j=0;j<_a_size;j++)
            {
            	if(_a_i!=j)
            	{
            		if(_a_item==Integer.parseInt(next_split[j]))
            		{
            			count++;
            			if(count>2)
            			{
            				break;
            			}
            		}
            	}
            }
            if(count==1)
            {
            	lonely=_a_item;
            	break;
            }
        }
        System.out.println(lonely);
        
    }
}
