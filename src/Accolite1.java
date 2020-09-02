
public class Accolite1 implements Runnable 
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread a = new Thread(new Accolite1());
		a.setPriority(Thread.MAX_PRIORITY);
		a.start();
		
		Thread.sleep(1);
		
		System.out.print("Begin");
		a.join();
		System.out.print("End");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Run");
	}
	
}
