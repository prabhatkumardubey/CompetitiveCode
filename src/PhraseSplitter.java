import java.util.LinkedList;

import java.util.Random;

public class PhraseSplitter
{
	/**
	 * Used to store the input phrase, allows comparison
	 */
	LinkedList<String> ordered = new LinkedList<String>();
	/**
	 * A copy is used to create mixed list
	 */
	LinkedList<String> copy = new LinkedList<String>();
	/**
	 * Holds mixed version of phrase input
	 */
	LinkedList<String> mixed = new LinkedList<String>();
	/**
	 * Assigned as input from orderPhrase method
	 */
	String phrase = "";
	/**
	 * Delimiter character, here we're just assuming a space
	 */
	String delimiter = " ";
	/** 
	 * Used temporarily for split values before they are added to the linked
	 * list
	 */
	String[] array;

	/**
	 * - takes a phrase as an input and adds it to a linked list using
	 * delimiter, a copy of the linked list is also created
	 * 
	 * @param phraseIn
	 *            - string representation of the phrase
	 */
	public void orderPhrase(String phraseIn)
	{
		phrase = phraseIn;
		array = phrase.split(delimiter);
		for (int i = 0; i < array.length; i++)
		{
			ordered.addLast((String) array[i]);
			copy.addLast((String) array[i]);
		}
	}

	/**
	 * - uses copy linked list and random generations to create a mixed list
	 */
	public void mixPhrase()
	{
		Random randomGenerator = new Random();
		int rand = 0;

		while (!copy.isEmpty())
		{
			rand = randomGenerator.nextInt(copy.size());
			mixed.addLast(copy.get(rand));
			copy.remove(rand);
		}
	}

	/**
	 * - compares string values at each position of ordered list and mixed list,
	 * if they match the variable c is increased by 1
	 * 
	 * @return <b>c</b> - int count of number of matching positions
	 */
	public int comparePhrase()
	{
		int c = 0;
		
		for (int i = 0; i < ordered.size(); i++)
		{
			if (ordered.get(i) == mixed.get(i))		c++;
		}

		return c;
	}

	/**
	 * - prints out ordered list words on a separate line
	 */
	public void printOrdered()
	{
		for (int i = 0; i < ordered.size(); i++)
		{
			System.out.println(ordered.get(i));
		}
	}

	/**
	 * - prints out mixed list words on a separate line
	 */

	public void printMixed()
	{
		for (int i = 0; i < mixed.size(); i++)
		{
			System.out.println(mixed.get(i));
		}
	}

	/**
	 * - prints out a list of words on a separate line
	 * 
	 * @param list
	 *            - the linked list to be printed out
	 */

	public void print(LinkedList<String> list)
	{
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

	/**
	 * - swaps two word positions in a phrase linked list
	 * 
	 * @param list
	 *            - Linked list that the swap operation will be performed on
	 * 
	 * @param i
	 *            - index number of first element to swap
	 * 
	 * @param j
	 *            - index number of second element to swap
	 * 
	 * @return <b>list</b> - Linked list with swapped elements (if successful,
	 *         else unaltered linked list)
	 */
	public LinkedList<String> swap(LinkedList<String> list, int i, int j)
	{
		try
		{
			String iS = list.get(i);
			String jS = list.get(j);
			list.set(i, jS);
			list.set(j, iS);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("ERROR: " + e);
		}
		
		return list;
	}

	/**
	 * - static test method
	 * 
	 * @param args
	 */

	public static void main(String args[])
	{
		// /*
		PhraseSplitter test = new PhraseSplitter();
		System.out.println("Ordered phrase is:");
		test.orderPhrase("this is a somewhat longer phrase");
		test.printOrdered();
		System.out.println("");
		test.mixPhrase();
		System.out.println("Mixed phrase is:");
		test.printMixed();
		System.out.println("");
		System.out.println(test.comparePhrase()
				+ " word positions in phrases matched");
		// */
		
		/*
		 * PhraseSplitter test = new PhraseSplitter();
		 * System.out.println("Ordered phrase is:");
		 * test.orderPhrase("this is a phrase");
		 * test.printOrdered();
		 * System.out.println(""); 
		 * System.out.println("Swapped phrase is:");
		 * test.swap(test.ordered, 0, 3);
		 * test.printOrdered();
		 */
	}
}