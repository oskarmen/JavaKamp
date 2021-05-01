package odevucuncu;


public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getStudentNumber() + "��renci numaras� eklendi");
	}

	public void delete(Student student) {
		System.out.println(student.getStudentNumber() + " ��rrnci nosu siilindi");
	}

	public void selectCourses(Student student) {
		System.out.println(student.getName() + " " + student.getTakenCourses() + " ders onayland�");
	}

	public void getAll(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getName() + " " + student.getStudentNumber());
		}
	}

}
