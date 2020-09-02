import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConcept 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ch[]={'p','r','a','b','h','a','t'};
		String s=new String(ch);
		//converting char array to string
		System.out.println(s);
		//string is immutable means unmodifiable
		String s1="sachin";
		s1.concat("tendulkar");//it is another instance
		System.out.println(s1);
		s1=s1.concat("cricket");
		System.out.println(s1);
		s1="sachin";
		/*
		 String is immutable because java uses the concept
		 of string literal. Suppose there are 5 reference variable,
		 all refers to one object "sachin".If one reference variable
		 changes the value of object, it will affected to all the
		 reference variable. That is why string object are immutable in java.
		 */
		// string comparison
		//three ways to compare string in java
		//1. by equals() method
		//2. by == operator compares reference not values
		//3. by compareTo() method give values +ve, 0 or -ve value
		String s2="Sachin";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1==s2);//false
		System.out.println(s1.compareTo(s2));//gives 32
		//concatenation in string
		//1. + string concatenation operator
		//2. concat() method
		String s3="sachin"+"tendulkar";
		System.out.println(s3);
		// what compiler does see down
		String s4=(new StringBuilder()).append("sachin").append(" tendulkar").toString();
		System.out.println(s4);
		String s5=50+30+"prabhat"+20+20;//50+30 will bee added and rest will assumed string
		System.out.println(s5);
		/*
		 * Note: After a string literal all the + will be treated as
		 * string concatenation operator*/
		System.out.println(s4.concat(s5));
		//substring in java
		//1. substring(int startIndex) method
		//2. substring(int startIndex, int endIndex)
		//Incase of string startIndex is inclusive
		// and endIndex is exclusive
		System.out.println(s5.substring(2));
		System.out.println(s5.substring(2,9));
		//toLowerCase() method
		//toUpperCase() method
		System.out.println(s2.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s5.toUpperCase());
		//trim() method to trim spaces left and right
		String s6=" sachin ";
		System.out.println(s6);
		System.out.println(s6.trim());
		System.out.println(s4.trim());//here it will not trim since space in middle
		//startsWith() method
		//endsWith() method gives boolean value both
		System.out.println(s5.startsWith("80"));//if inverted comma not used error here
		System.out.println(s5.startsWith("p"));
		System.out.println(s5.endsWith("20"));//s5=80prabhat2020
		//charAt() method
		System.out.println(s5.charAt(6));//h
		//length() method total no of character in string
		System.out.println(s5.length());//13
		//intern() method
		/*
		 * A pool of string initially empty, is maintained privately by the class String
		 * When the intern method is invoked, if the pool already contains a string 
		 * equal to this string object as determined by the equals(Object) method
		 * then the string from the pool is returned. Otherwise this String object is 
		 * added to pool and reference to this String object is returned.*/
		String s7="prabhat";
		System.out.println(s7.intern());
		//valueOf() method converts given type in String
		int a=10;
		String s8=String.valueOf(a);
		System.out.println(s8+9);
		//replace() method
		System.out.println(s7.replace("abhat", "iyanuj"));
		//StringBuffer continues...
	}
}
