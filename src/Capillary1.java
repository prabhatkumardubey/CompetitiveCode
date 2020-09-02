import java.util.Iterator;
import java.util.TreeMap;

class Capillary1 
{
	public static void main(String args[])
	{
		Capillary1 junk=new Capillary1();
		junk.sampleMap();
	}
	public void sampleMap()
	{
		TreeMap tm=new TreeMap();
		tm.put("a", "Hello");
		tm.put("b", "Java");
		tm.put("c", "World");
		Iterator it=tm.keySet().iterator();
		while(it.hasNext())
			System.out.print(it.next());
	}
}
