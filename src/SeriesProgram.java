import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1, -2, 6, -15, 31, -56,....N
//1, 1 + 1^2 = 2, 2 + 2^2 = 6, 6 + 3^2 = 15, 15 + 4^2 = 31, 31 + 5^2 = 56, 56 + 6^2 = 92
class SeriesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int N=Integer.parseInt(br.readLine());
			int x=1;
			int y=0;
			int sum=0;
			for(;y<N;y++){
				sum=(int) (x+Math.pow(y, 2));
				x=sum;
				if(y%2!=0){sum*=-1;};
				System.out.println(sum);
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
