import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HE_CM_02 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int V[]=new int[T];
		double S,PI,R;
		PI=3.14;
		double H=0.0;
		DecimalFormat df=new DecimalFormat("0.#########");
		df.setRoundingMode(RoundingMode.DOWN);
		for(int i=0;i<T;i++)
		{
			V[i]=Integer.parseInt(br.readLine());
			H=Math.cbrt((double)((double)(4*V[i])/(PI)));
			R=Math.cbrt((double)((double)V[i])/(2*PI));
			S=2*PI*R*(R+H);
			System.out.println(Double.valueOf(df.format(S)));
		}
	}
}
