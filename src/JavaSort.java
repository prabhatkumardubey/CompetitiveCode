import java.util.*;

class Student1 implements Comparable<Student1>{
   private int id;
   private String fname;
   private double cgpa;
   public Student1(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   public int compareTo(Student1 o) {
	// TODO Auto-generated method stub
		if(o.cgpa==cgpa){
			if(o.fname==fname){
				return id-o.id;
			}
			else{
				return fname.compareTo(o.fname);
			}
		}
		else{
			if(cgpa<o.cgpa){
				return 1;
			}
			else{
				return -1;
			}
		}
   }
}

//Complete the code
class JavaSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student1> studentList = new ArrayList<Student1>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student1 st = new Student1(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      	Collections.sort(studentList);
         for(Student1 st: studentList){
         System.out.println(st.getFname());
      }
   }
}
