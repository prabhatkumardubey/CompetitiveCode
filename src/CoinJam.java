import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class CoinJam 
{
	private static BigInteger tw=new BigInteger("2");
	private static BigInteger th=new BigInteger("3");
	private static BigInteger fo=new BigInteger("4");
	private static BigInteger fi=new BigInteger("5");
	private static BigInteger si=new BigInteger("6");
	private static BigInteger se=new BigInteger("7");
	private static BigInteger ei=new BigInteger("8");
	private static BigInteger ni=new BigInteger("9");
	private static BigInteger te=new BigInteger("10");
	private static BigInteger a=new BigInteger("0");
	private static BigInteger b=new BigInteger("0");
	private static BigInteger c=new BigInteger("0");
	private static BigInteger d=new BigInteger("0");
	private static BigInteger e=new BigInteger("0");
	private static BigInteger f=new BigInteger("0");
	private static BigInteger g=new BigInteger("0");
	private static BigInteger h=new BigInteger("0");
	private static BigInteger m=new BigInteger("0");
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			for(int i=0;i<T;i++)
			{
				String input=br.readLine();
				String st[]=input.split(" ");
				int N=Integer.parseInt(st[0]);
				int J=Integer.parseInt(st[1]);
				BigInteger start=new BigInteger(""+(int)((Math.pow(2, N-1))+1));
				BigInteger two=new BigInteger("0");
				BigInteger three=new BigInteger("0");
				BigInteger four=new BigInteger("0");
				BigInteger five=new BigInteger("0");
				BigInteger six=new BigInteger("0");
				BigInteger seven=new BigInteger("0");
				BigInteger eight=new BigInteger("0");
				BigInteger nine=new BigInteger("0");
				BigInteger ten=new BigInteger("0");
				
				System.out.println("Case #"+(i+1)+":");
				
				for(int k=0;k<J;start=start.add(BigInteger.ONE))
				{
					String jam=Integer.toBinaryString(start.intValue());
					System.out.println("hi "+start);
					if(start.equals("32779"))
					{
						System.out.println("lol");
						continue;
					}
					a=new BigInteger("0");
					b=new BigInteger("0");
					c=new BigInteger("0");
					d=new BigInteger("0");
					e=new BigInteger("0");
					f=new BigInteger("0");
					g=new BigInteger("0");
					h=new BigInteger("0");
					m=new BigInteger("0");
					int ct=0;
					for(int l=jam.length()-1;l>=0;l--,ct++)
					{
						//System.out.println("hel");
						if(jam.charAt(l)=='1')
						{
							two=two.add(tw.pow(ct));
							three=three.add(th.pow(ct));
							four=four.add(fo.pow(ct));
							five=five.add(fi.pow(ct));
							six=six.add(si.pow(ct));
							seven=seven.add(se.pow(ct));
							eight=eight.add(ei.pow(ct));
							nine=nine.add(ni.pow(ct));
							ten=ten.add(te.pow(ct));
						}
					}
					System.out.println("out");
					
					//System.out.println("hel "+two);
					//System.out.println("hel "+two+" "+three+" "+four+" "+five+" "+six+" "+seven+" "+eight+" "+nine+" "+ten);
					if(!(isPrime(two)) && !(isPrime(three)) && !(isPrime(four)) && !(isPrime(five)) && !(isPrime(six)) &&!(isPrime(seven)) && !(isPrime(eight)) && !(isPrime(nine)) && !(isPrime(ten)))
					{
						System.out.println(jam+" ");
						//System.out.println("hel "+two+" "+three+" "+four+" "+five+" "+six+" "+seven+" "+eight+" "+nine+" "+jam+ "next");
						BigInteger p=new BigInteger("2");
						for(p=tw;p.compareTo(two)<0;p=p.add(BigInteger.ONE))
						{
							if((two.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								a=p;
								break;
							}
						}
						for(p=tw;p.compareTo(three)<0;p=p.add(BigInteger.ONE))
						{
							if((three.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								b=p;
								break;
							}
						}
						for(p=tw;p.compareTo(four)<0;p=p.add(BigInteger.ONE))
						{
							if((four.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								c=p;
								break;
							}
						}
						for(p=tw;p.compareTo(five)<0;p=p.add(BigInteger.ONE))
						{
							if((five.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								d=p;
								break;
							}
						}
						for(p=tw;p.compareTo(six)<0;p=p.add(BigInteger.ONE))
						{
							if((six.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								e=p;
								break;
							}
						}
						for(p=tw;p.compareTo(seven)<0;p=p.add(BigInteger.ONE))
						{
							//System.out.println("four "+p);
							if((seven.mod(p)).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								f=p;
								break;
							}
						}
						
						for(p=tw;p.compareTo(eight)<0;p=p.add(BigInteger.ONE))
						{
							if(eight.mod(p).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								g=p;
								break;
							}
						}
						for(p=tw;p.compareTo(nine)<0;p=p.add(BigInteger.ONE))
						{
							if(nine.mod(p).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								h=p;
								break;
							}
						}
						for(p=tw;p.compareTo(ten)<0;p=p.add(BigInteger.ONE))
						{
							if(ten.mod(p).equals(BigInteger.ZERO))
							{
								//System.out.print(p+" ");
								m=p;
								break;
							}
						}
						
						//System.out.println();
					}
					if(!a.equals(BigInteger.ZERO) && !b.equals(BigInteger.ZERO) && !c.equals(BigInteger.ZERO) && !d.equals(BigInteger.ZERO) && !e.equals(BigInteger.ZERO) && !f.equals(BigInteger.ZERO) && !g.equals(BigInteger.ZERO) && !h.equals(BigInteger.ZERO) && !m.equals(BigInteger.ZERO))
					{
						System.out.println(jam+" "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+m);
						k++;
					}
					//System.out.println("h "+start);
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static boolean isPrime(BigInteger input)
	{
		//System.out.println("prime");
		
		if(input.equals(BigInteger.ONE))
			return false;
		
	    if (input.equals(tw))
	        return true;

	    if (input.mod(tw).equals(BigInteger.ZERO))
	        return false;

	    BigInteger i=new BigInteger("3");
	    for (;(i.compareTo(input.divide(tw)))<=0;i=i.add(BigInteger.ONE)){
	    	//System.out.println("prim "+i);
	        if (input.mod(i).equals(BigInteger.ZERO))
	            return false;}

	    return true;

	}
}
