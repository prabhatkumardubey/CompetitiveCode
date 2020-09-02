import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class EraseMultiples {
	static int countUneatenLeaves(int N, int[] A) {
		int count=0;
		int arr[]=new int[N];
		for(int i=1;i<=N;i++){
			arr[i-1]=i;
		}
		for(int i=0;i<A.length;i++){
			for(int j=0;j<N;j++){
				if(arr[j]%A[i]==0 && arr[j]!=0){
					arr[j]=0;
					count++;
				}
			}
		}
		return (N-count);
    }
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        int _N;
        _N = Integer.parseInt(in.nextLine().trim());
        
        
        int _A_size = 0;
        _A_size = Integer.parseInt(in.nextLine().trim());
        int[] _A = new int[_A_size];
        int _A_item;
        for(int _A_i = 0; _A_i < _A_size; _A_i++) {
            _A_item = Integer.parseInt(in.nextLine().trim());
            _A[_A_i] = _A_item;
        }
        
        res = countUneatenLeaves(_N, _A);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
}
