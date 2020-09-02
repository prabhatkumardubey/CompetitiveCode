import java.util.*;

class PowerSet {
	public static int n;
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		n=sc.nextInt();
		Set<Integer> list=new HashSet<Integer>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		//Set<Set<Integer>> newlist=powerSet(list);
		Object[] arr=powerSet(list).toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
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
