//use rather stringbuilder it will work fast as given below
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SherlockAndTheBeast {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		try {
			T = Integer.parseInt(br.readLine());
			while(T-->0){
				int N=Integer.parseInt(br.readLine());
				int ct=N;
				int nf=0;
				while(ct%3!=0){
					ct-=5;
				}
				if(ct<0){
					System.out.println("-1");
				}
				else{
                    if(ct%100==0 && ct>=100){
                        for(int i=0;i<nf/100;i++){
                                   System.out.print("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
                        }
                    }
                    else if(ct%10==0 && ct>=10){
                        for(int i=0;i<ct/10;i++){
                        	System.out.print("5555555555");
                        }
                    }
                    else if(ct%7==0 && ct>=7){
                         for(int i=0;i<ct/7;i++){
                        	 System.out.print("5555555");
                        }
                    }
                    else if(ct%5==0 && ct>=5){
                         for(int i=0;i<ct/5;i++){
                        	 System.out.print("55555");
                        }
                    }
                    else if(ct%3==0 && ct>=3){
                         for(int i=0;i<ct/3;i++){
                        	 System.out.print("555");
                        }
                    }
                    else if(ct%2==0 && ct>=2){
                         for(int i=0;i<ct/2;i++){
                        	 System.out.print("55");
                        }
                    }
                    else if(ct%1==0 && ct>=1){
                        for(int i=0;i<ct;i++){
                        	System.out.print("5");
                        }
                    }
                    if((N-ct)%100==0 && (N-ct)>=100){
                        for(int i=0;i<(N-ct)/100;i++){
                        	System.out.print("3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
                        }
                    }
                    else if((N-ct)%10==0 && (N-ct)>=10){
                        for(int i=0;i<(N-ct)/10;i++){
                        	System.out.print("3333333333");
                        }
                    }
                    else if((N-ct)%7==0 && (N-ct)>=7){
                         for(int i=0;i<(N-ct)/7;i++){
                        	 System.out.print("3333333");
                        }
                    }
                    else if((N-ct)%5==0 && (N-ct)>=5){
                         for(int i=0;i<(N-ct)/5;i++){
                        	 System.out.print("33333");
                        }
                    }
                    else if((N-ct)%3==0 && (N-ct)>=3){
                         for(int i=0;i<(N-ct)/3;i++){
                        	 System.out.print("333");
                        }
                    }
                    else if((N-ct)%2==0 && (N-ct)>=2){
                         for(int i=0;i<(N-ct)/2;i++){
                        	 System.out.print("33");
                        }
                    }
                    else if((N-ct)%1==0 && (N-ct)>=1){
                        for(int i=0;i<(N-ct);i++){
                        	System.out.print("3");
                        }
                    }
                    System.out.println();
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            {
                int n = in.nextInt();
                StringBuilder strb=new StringBuilder();
                int j=0;
                for(int i=n;i>0;i--)

                {   
                    if(i%3==0 && (n-i)%5==0)
                    {
                        for(j=0;j<i;j++)
                            strb.append("5");
                        for(int k=j;k<n;k++)
                            strb.append("3");
                        break;

                    }
                }
                if(strb.length()==0 && n%5==0)
                    for(int k=n;k>0;k--)
                        strb.append("3");
                else if(strb.length()==0)
                    strb.append(-1);

                System.out.println(strb);
            }

        }
    }
}

 **/
