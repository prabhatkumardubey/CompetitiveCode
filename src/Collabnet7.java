
interface ParentCollabnet
{
	public void run();
}

class ChildCollabnet implements ParentCollabnet
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HackerEarth");
	}
	
}

class SubclassCollabnet extends ChildCollabnet
{
	public void run()
	{
		System.out.println("IndiaHacks");
	}
}

class Collabnet7 
{
	public static void main(String args[])
	{
		ParentCollabnet sc=new SubclassCollabnet();
		sc.run();
		ParentCollabnet c=new ChildCollabnet();
		c.run();
	}
}
