class HP_Problem7 extends Thread
{
	public void run()
	{
		while(true)
		{
			long threadId =Thread.currentThread().getId();
			System.out.println("Hello World ! "+threadId);
			//sleep for sometime
		}
	}
	public void doSomething()
	{
		this.start();
	}
	public static void main(String s[])
	{
		HP_Problem7 a =new HP_Problem7();
		a.start();
		a.doSomething();
	}
}
