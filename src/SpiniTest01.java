
public class SpiniTest01 
{
	public static void main(String args[])
	{
		SpiniTest01 p=new SpiniTest01();
		p.start();
	}
	void start()
	{
		boolean b1=false;
		boolean b2=fix(b1);
		System.out.println(b1 + " "+ b2);
	}
	boolean fix(boolean b1)
	{
		b1=true;
		return b1;
	}
}
