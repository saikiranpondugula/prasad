package database.mysql23;

public class Student {
	
	int StudentId;
	String StudentName;
	int marks;
	
	public Student(int studentId, String studentName, int marks) {
		StudentId = studentId;
		StudentName = studentName;
		this.marks = marks;
	}
}
