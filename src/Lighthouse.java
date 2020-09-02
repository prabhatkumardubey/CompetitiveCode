import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lighthouse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=br.readLine();
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int count=getMaxRadius(arr,n,i,j);
				if(count>max){
					max=count;
				}
			}
		}
		System.out.println(max);
	}

	private static int getMaxRadius(String[] arr,int n,int i, int j) {
		// TODO Auto-generated method stub
		int temp=1,count=0;
		if(arr[i].charAt(j)=='.'){
			while(i>=(0+temp) && i<=(n-1-temp) && j>=(0+temp) && j<=(n-1-temp)){
				int cal=temp;
				for(int p=i-temp;p<=i+temp;p++){
					int cl=(cal>=0?cal:(-1*cal));
					for(int q=j-temp+cl;q<=j+temp-cl;q++){
						if(arr[p].charAt(q)!='.'){
							return count;
						}
					}
					cal--;
				}
				count++;
				temp++;
			}
		}	
		return count;
	}
}
