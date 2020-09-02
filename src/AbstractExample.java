import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}
class MyBook extends Book
{
	private int p;
	public MyBook(String title, String author, int price) 
	{
		super(title, author);
		p=price;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+p);
	}
	
}

class AbstractExample
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
