import java.util.Scanner;

class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int min=findMin(i,j,width);
            System.out.println(min);
        }
        
	}

	static int findMin(int i, int j, int[] width) {
		// TODO Auto-generated method stub
		int min=3;//largest vehicle is truck=3
		for(;i<=j;i++){
			if(width[i]<min){
				min=width[i];
			}
		}
		return min;
	}

}
