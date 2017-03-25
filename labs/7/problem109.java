
public class problem109 {
	public static void main(String[] args) {
		
		String[] currStudents;
        
		Course course = new Course("Software Development Class");
        
        course.addStudent("Monica Figueroa");
        course.addStudent("Cora Curtis");
        course.addStudent("William Norman");
        
        System.out.println("The students enrolled in the course: ");
       
        currStudents = course.getStudents();
        
        for(int x = 0; x<course.getNumberOfStudents(); x++)
        	System.out.print(currStudents[x]+",");
        
        System.out.println();
        
        course.dropStudent("Cora Curtis");
        
        System.out.println("\n Cora Curtis has been removed from the course.");
        
        System.out.println("\nThe remaining students in the course: ");
        
        currStudents = course.getStudents();
        
        for(int x = 0; x<course.getNumberOfStudents(); x++)
        	System.out.print(currStudents[x]+",");
        
        System.out.println();
	}
}

class Course {
	private String courseName;
	
	private String[] students = new String[100];
	
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		if(numberOfStudents >= students.length) {
			String[] newArray = new String[students.length*2];
			
			System.arraycopy(student, 0, newArray, 0, students.length);
	
			students = newArray;
		}
		students[numberOfStudents] = student;
		
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		int foundPos;
		int movedPos;
		boolean isFound = false;
		for(foundPos = 0; foundPos < students.length; foundPos++) {
			if(students[foundPos] == student) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			for(movedPos = foundPos; movedPos < students.length-1; movedPos++) {
				students[movedPos] = students[movedPos+1];
			}
	
			numberOfStudents--;
			
		}
	}
	public void clear() {
		java.util.Arrays.fill(students, null);
		numberOfStudents = 0;
	}

}

