
public class HP_Problem8 
{
	private int i;
	public void setValue(int i)
	{
		i=this.i;
		return;
	}
	
	public static void updateInteger(HP_Problem8 a)
	{
		HP_Problem8 b=new HP_Problem8();
		a.setValue(299);
		return;
	}
	public int getValue()
	{
		return 399;
	}
	public static  void main(String []s)
	{
		HP_Problem8 a =null;
		updateInteger(a);
		a.setValue(499);
		System.out.println("Value of I is:"+a.getValue());
	}
}
