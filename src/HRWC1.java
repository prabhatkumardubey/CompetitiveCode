import java.io.*;
public class HRWC1 
{
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[10];
        int temp=0,big=0;
        for(int i=0;i<10;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            big=arr[i];
            for(int j=i;j<10;j++)
            {
                if(big<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    big=arr[i];
                }
            }
        }
        int count1=arr[0]+arr[2]+arr[4];
        int count2=arr[1]+arr[3]+arr[5];
        if(count1 > count2)
        {
            System.out.println(count1);
        }
    }
}
