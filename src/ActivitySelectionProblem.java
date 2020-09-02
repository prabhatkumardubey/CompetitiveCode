
class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consider 6 activities
		int start[]={1,3,0,5,8,5};
		int finish[]={2,4,6,7,9,9};
		//find maximum set of activities that can be executed by single person
		//1. sort according to finish
		int val=0;
		for(int i=0;i<6;i++){
			int temp=i;
			for(int j=i+1;j<6-i;j++){
				if(finish[j]<finish[i]){
					temp=j;
				}
			}
			if(temp!=i){
				val=finish[i];
				finish[i]=finish[temp];
				finish[temp]=val;
				val=start[i];
				start[i]=start[temp];
				start[temp]=val;
			}
		}
		System.out.println(1);
		for(int i=0,j=1;j<6;j++){
			if(start[j]>=finish[i]){
				System.out.println(j+1);
				i=j;
			}
		}
	}
}


