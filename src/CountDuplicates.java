import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class CountDuplicates {
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _numbers_size = Integer.parseInt(in.nextLine());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for(int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine());
            _numbers[_numbers_i] = _numbers_item;
        }
        
        res = countDuplicates(_numbers);
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }

	static int countDuplicates(int[] numbers) {
        int count=0;
        int temp=0;
		for(int i=0;i<numbers.length;i++){
        	if(numbers[i]!=0){
        		temp=0;
        		for(int j=i+1;j<numbers.length;j++){
        			if(numbers[j]!=0 && numbers[i]==numbers[j]){
        				temp=1;
        				numbers[j]=0;
        			}
        		}
        		if(temp==1){
        			count++;
        			numbers[i]=0;
        		}
        	}
        }
		return count;
    }
}
