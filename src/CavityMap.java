import java.util.Scanner;

class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        int big=0;
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            int dup=Integer.parseInt(grid[grid_i]);
            while(dup>0){
            	if(dup%10>big){
            		big=dup%10;
            	}
            	dup/=10;
            }
        }
        String str=big+"";
        char strbig=str.charAt(0);
        for(int i=0;i<n;i++){
        	grid[i]=grid[i].replace(strbig, 'X');
        	System.out.println(grid[i]);
        }
	}

}
