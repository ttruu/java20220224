package chap13.book.s1306;

import java.util.Arrays;

public class wildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		
	Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
	personCourse.add(new Person("일반인"));
	personCourse.add(new Person("직장인"));
	personCourse.add(new Person("학생"));
	personCourse.add(new Person("고등학생"));
	
	Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
	workerCourse.add(new Worker("직장인"));
	
	Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
	studentCourse.add(new Student("학생"));
	studentCourse.add(new HighStudent("고등학생"));
	
	Course<HighStudent> HighstudentCourse = new Course<HighStudent>("고등학생 과정", 5);
	studentCourse.add(new HighStudent("고등학생"));
	
	registerCourse(personCourse);
	registerCourse(workerCourse);
	registerCourse(studentCourse);
	registerCourse(HighstudentCourse);
	System.out.println();
	
	
	
	}
}
