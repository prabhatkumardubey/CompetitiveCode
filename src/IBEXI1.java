import java.util.HashMap;

class IBEXI1 
{
	public static void main(String args[]) throws Exception
	{
		HashMap<Integer, String> hash=new HashMap<Integer, String>();
		System.out.println(hash);
		hash.put(1, "hack");
		hash.put(2,"earth");
		System.out.println(hash);
		hash.clear();
	}
}
