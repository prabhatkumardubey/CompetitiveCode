
public class Accolite3 implements Runnable
{
	public static void main(String args[])
	{
		Thread t= new Thread();
		t.run();
		t.run();
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("h");
	}
	
}
