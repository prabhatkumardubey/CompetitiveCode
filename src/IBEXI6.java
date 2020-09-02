
class IBEXI6 
{
	public static void main(String args[])
	{
		double myList[]={1, 4, 4,4, 1};
		double max=myList[0];
		int indexOfMax=0;
		for(int i=1;i<myList.length;i++)
		{
			if(myList[i]>max)
			{
				max=myList[i];
				indexOfMax=i;
			}
		}
		System.out.println(indexOfMax);
	}
}
