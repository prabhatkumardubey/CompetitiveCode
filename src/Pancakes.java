import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pancakes 
{
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int  T=Integer.parseInt(br.readLine());
			int o[]=new int[T];
			for(int i=0;i<T;i++)
			{
				int count=0;
				String input=br.readLine();
				while(!check(input))
				{
					//System.out.println("enter "+count);
					if(input.charAt(0)=='-' && input.charAt(input.length()-1)=='-')
					{
						//System.out.println("hi - -");
						input=reverseAlteration(input);
						count++;
						//System.out.println("hell - - "+input+" "+count);
					}
					else if(input.charAt(0)=='+' && input.charAt(input.length()-1)=='-')
					{
						//System.out.println("hi + -");
						int index=input.length()-1;
						for(;index>=0;index--)
						{
							if(input.charAt(index)!='-')
							{
								break;
							}
						}
						input=alterEnding(input,index);
						count++;
						//System.out.println("hell + - "+input+" "+count);
					}
					else if(input.charAt(0)=='-' && input.charAt(input.length()-1)=='+')
					{
						//System.out.println("hi - +");
						int index=input.length()-1;
						for(;index>=0;index--)
						{
							if(input.charAt(index)=='-')
							{
								break;
							}
						}
						input=alterStart(input,index);
						count++;
						//System.out.println("hell - + "+input+" "+count);
					}
					else if(input.charAt(0)=='+' && input.charAt(input.length()-1)=='+')
					{
						//System.out.println("hi + +");
						int index=0;
						for(;index<input.length();index++)
						{
							if(input.charAt(index)=='-')
							{
								break;
							}
						}
						input=alterEnd(input,index);
						count++;
						//input=alterStart(input,index);
						//count++;
						//System.out.println("hell + + "+input+" "+count);
					}
				}
				o[i]=count;
				//System.out.println("count "+count);
			}
			for(int i=1;i<=T;i++)
			{
				System.out.println("Case #"+i+": "+o[i-1]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static String alterStart(String input, int index) {
		// TODO Auto-generated method stub
		String inp="";
		for(int i=0;i<=index;i++)
		{
			if(input.charAt(i)=='-')
			{
				inp+="+";
			}
			else
			{
				inp+="-";
			}
		}
		inp+=input.substring(index+1);
		return inp;
	}

	private static String alterEnd(String input, int index) {
		// TODO Auto-generated method stub
		String inp="";
		for(int i=0;i<index;i++)
		{
			if(input.charAt(i)=='-')
			{
				inp+="+";
			}
			else
			{
				inp+="-";
			}
		}
		inp+=input.substring(index);
		return inp;
	}
	private static String alterEnding(String input, int index) {
		// TODO Auto-generated method stub
		String inp="";
		for(int i=0;i<=index;i++)
		{
			if(input.charAt(i)=='-')
			{
				inp+="+";
			}
			else
			{
				inp+="-";
			}
		}
		inp+=input.substring(index+1);
		return inp;
	}
	private static String reverseAlteration(String input) {
		// TODO Auto-generated method stub
		String inp="";
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)=='-')
			{
				inp+="+";
			}
			else
			{
				inp+="-";
			}
		}
		return inp;
	}

	private static boolean check(String input) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!='+')
			{
				return false;
			}
		}
		return true;
	}
}
