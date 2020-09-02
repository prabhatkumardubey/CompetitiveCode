import java.io.IOException;
import java.lang.reflect.Method;
class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Printer1 myPrinter = new Printer1();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	        int count = 0;

	        for (Method method : Printer1.class.getDeclaredMethods()) {
	            String name = method.getName();

	            if(name.equals("printArray")){
	                count++;
	                System.out.println("count = "+count);
	            }
	        }

	        if(count > 1)System.out.println("Method overloading is not allowed!");
	      

	}

}
class Printer1
{

	//Write your code here

	public void printArray(Object[] intArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}
	}
 
}

