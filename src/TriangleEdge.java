import java.util.ArrayList;

class TriangleEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int find(int n, int[] x, int[] y){
		ArrayList<Integer> arx=new ArrayList<Integer>();
		ArrayList<Integer> ary=new ArrayList<Integer>();
		for(int i=0;i<x.length;i++){
			int temp=0;
			for(int j=0;j<x.length;j++){
				if(x[i]==x[j] && y[i]==y[j] && i!=j){
					temp=1;
				}
			}
			if(temp==0){
				arx.add(x[i]);
				ary.add(y[i]);
			}
		}
		int edge=arx.size()-1;
		if(edge>3){
			return 0;
		}
		else{
			return 3-edge;
		}
		
	}

}
