package odevucuncu;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setInstructorNumber("1");
		instructor1.setName("Engin");
		instructor1.setEmail("engin@gmail");
		instructor1.setGivenCourses("Java");

		Student student1 = new Student();
		student1.setStudentNumber("150");
		student1.setName("osman");
		student1.setEmail("osman@gmail");
		student1.setTakenCourses("Java");

		Student student2 = new Student();
		student2.setStudentNumber("132");
		student2.setName("hasan");
		student2.setEmail("haso@gmail");
		student2.setTakenCourses("C");

		Student student3 = new Student("ali", "132", "ali@gmail");

		Student[] students = { student1, student2, student3 };

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.selectCourses(student1);

		studentManager.add(student2);
		studentManager.selectCourses(student2);
		studentManager.delete(student2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

		studentManager.getAll(students);

	}

}


