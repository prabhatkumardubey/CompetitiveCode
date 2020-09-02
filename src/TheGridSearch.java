import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TheGridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			while(T-->0){
				String rc=br.readLine();
				String[] split=rc.split(" ");
				int R=Integer.parseInt(split[0]);
				int C=Integer.parseInt(split[1]);
				String arr[]=new String[R];
				for(int i=0;i<R;i++){
					arr[i]=br.readLine();
				}
				rc=br.readLine();
				split=rc.split(" ");
				int r=Integer.parseInt(split[0]);
				int c=Integer.parseInt(split[1]);
				String find[]=new String[r];
				for(int i=0;i<r;i++){
					find[i]=br.readLine();
				}
				int count=0;
				boolean result=false;
				for(int i=0;i<=R-r;i++){
					int end=c;
					int start=0;
					while(end<=C){
						if(arr[i].substring(start, end).equals(find[0])){
							for(int j=1;j<r;j++){
								if(arr[i+j].substring(start, end).equals(find[j]))
									count++;
								if(count==r-1)
									result=true;
							}
						}
						count=0;
						end++;
						start++;
					}
				}
				if(result){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
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
