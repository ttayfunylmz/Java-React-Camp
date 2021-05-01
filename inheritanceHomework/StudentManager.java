package inheritanceHomework;

public class StudentManager extends UserManager{
	
	public void addStudent(Student student) {
		
		System.out.println("Student is added : " + student.getName());
		
		
	}

}
