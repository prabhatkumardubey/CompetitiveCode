import java.util.*;
	import java.util.regex.*;
	import java.text.*;
	import java.math.*;
	import java.awt.geom.*;

	public class Initials
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getInitials(String name)
	{
		String arr[]=name.split(" ");
		String acronym="";
		for(String i: arr){
			acronym+=(i.charAt(0));
		}
		return acronym;		
	}
	
}
