import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TC_SRM_149_01 
{
	public static void main(String args[])
	{
		String str=amount(0,99);
	}
	public static String amount(int dollars, int cents)
	{
		DecimalFormat df=new DecimalFormat("0.##");
		df.setRoundingMode(RoundingMode.DOWN);
		int centAmt=cents/100;
		int newAmt=dollars+centAmt;
		int modVal=cents%100;
		int dup=newAmt;
		String str="";
		int count=0;
		while(dup>0)
		{
			if(count%3==0 && count!=0)
			{
				str=","+str;
			}
			str=(dup%10)+str;
			count++;
			dup/=10;
		}
		if(count==0)
		{
			str=str+"0";
		}
		count=0;
		dup=modVal;
		while(dup>0)
		{
			count++;
			dup/=10;
		}
		String exp="";
		if(count<2)
		{
			exp=exp+"0"+modVal;
		}
		else
		{
			exp=exp+modVal;
		}
		str="$"+str+"."+exp;
		System.out.println(str);
		return str;
		
	}
}
