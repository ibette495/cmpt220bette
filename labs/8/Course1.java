import java.util.ArrayList;
class Course1 {
	
	private String CourseName;
	
	private ArrayList students;
	
	public Course1 (String CN) {
		CourseName = CN;
		students = new ArrayList();
	}
	
	public void addStudent (String stu) {
		students.add(stu);
	}
	
	public ArrayList getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void dropStudent (String stu) {
		students.remove(stu);
	}
	
	public String toString() {
		String s = "";
	
		s = CourseName + "(" + students.size() + "students)\n";
		
		for(int x = 0; x < students.size(); x++) {
			s += "(" + (x+1) + ") " + students.get(x) +
					"\n";	
		} 
		return s;
	}
	
	public void clear() {
		students.clear();
	}

}
