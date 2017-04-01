import java.util.ArrayList;
public class CourseTest {

	public static void main(String[] args) {
		Course1 c1 = new Course1 ("Software Devepolment1"); // JA
		
		Course1 c2 = new Course1 ("Software Devepolment2"); // JA
		
		c1.addStudent("Ian Bette");
		c1.addStudent("Kyle Berkowitz");
		c1.addStudent("Jason Chiappa");
		c1.addStudent("Josh Britain");
		
		c2.addStudent("Colin Salvato");
		c2.addStudent("Connor Caruso");
		c2.addStudent("Luke Loele");
		
		
		System.out.println("Number of students in course1: " + c1.getNumberOfStudents());
		
		ArrayList a1 = c1.getStudents();
		
		for(int x = 0; x <c1.getNumberOfStudents(); x++) 
			System.out.print(a1.get(x)+ ", ");
		
		System.out.println();
		
		System.out.print("The Number of Students in course2 is:" + c2.getNumberOfStudents());
		
		System.out.println();
		
		ArrayList a2 = c2.getStudents();
		
		for (int x = 0; x < c2.getNumberOfStudents(); x++) 
			System.out.print(a2.get(x) + ", ");
		
		System.out.println();
		c1.dropStudent("Josh Britain");
		
		System.out.println("\nNew list of course 1 after drop a student Josh Britain: " + c1);
		c2.clear();
		System.out.println("\nNew Course2 list after using clear() method: " + c2);
	}

}
