import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class VanyaAndGCDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> list=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		//Set<Set<Integer>> newlist=powerSet(list);
		Object[] arr=powerSet(list).toArray();
		int count=0;
		for(int i=1;i<arr.length;i++){
			int g=0;
			String str=arr[i].toString();
				str=str.substring(1,str.length()-1);
			String split[]=str.split(", ");
			for(int j=0;j<split.length;j++){
				g=gcd(g,Integer.parseInt(split[j]));
			}
			if(g==1){
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static int gcd(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1%n2==0){
			return n2;
		}
		else{
			return gcd(n2,n1%n2);
		}
		
	}

	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
