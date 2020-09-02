import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class E123_1 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double num=Double.parseDouble(br.readLine());
		DecimalFormat df=new DecimalFormat("0.###");
		df.setRoundingMode(RoundingMode.DOWN);
		DecimalFormat df2=new DecimalFormat("0.#######");
		df2.setRoundingMode(RoundingMode.DOWN);
		System.out.println(Double.valueOf(df.format(num))+" "+Double.valueOf(df2.format(num)));
	}
}