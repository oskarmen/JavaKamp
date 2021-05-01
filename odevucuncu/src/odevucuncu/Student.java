package odevucuncu;

public class Student extends User {
	private String takenCourses;
	private String studentNumber;

	public Student() {

	}

	public Student(String name, String studentNumber, String email) {
		this.setName(name);
		this.studentNumber = studentNumber;
		this.setEmail(email);
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}