/*
 * 
You are standing in a school hallway lined with 100 closed lockers.
 You then open all 100 lockers. 
 After this, you then close every 2nd locker (so the 2nd, 4th, 6th…98th and 100th are all closed).
  Then, you go to every third locker and open it if it is closed or close it if it is open
   (let’s call this toggling the locker for our discussion). 
   You proceed to toggle every nth locker on pass number n. 
   So, for example, on pass number 16 – you will toggle every 16th locker. 
   After your hundredth pass of the hallway, in which you toggle only locker number 100,
    how many lockers are now open?

In a hall with x lockers, how many lockers remain open after pass number x?
 */
class ToggleLockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[100];
		for(int i=1;i<=100;i++){
			for(int j=1;j<=100;j++){
				if(j%i==0){
				ar[j-1]=(ar[j-1]==0?1:0);}
			}
		}
		int ct=0;
		for(int i=0;i<100;i++){
			if(ar[i]==1){
				ct++;
			}
		}
		/*
		 * If there are x lockers, the number of open lockers will be the 
		 * number of perfect squares between 1 and x (inclusive). 
		 * To count them, all you need to do is 
		 * find the square root of the largest perfect square less than or equal to x. 
		 * So, the general solution would be: floor(sqrt(x))
			Here’s an example to help illustrate this:
			If x = 200, then sqrt(200) = 14.142 ..
			
			And because floor(sqrt(200)) = 14,
			
			… there will be 14 open lockers.*/
		/*int ct=(int) Math.sqrt(200);*/
		System.out.println(ct);
	}

}
