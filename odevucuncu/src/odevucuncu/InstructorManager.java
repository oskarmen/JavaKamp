package odevucuncu;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+"ins eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getName()+"ins delete");
		
	}
	public void selectCourses(Student student) {
		System.out.println(student.getName()+" "+student.getTakenCourses()+"ders onaylandý");
		
	}

}
