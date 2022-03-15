package chap07.book.exercise.p05;


// Parent, Child 아래 메인클래스


public class App01 {
	public static void main(String[] args) {
		Child c1 = new Child("donald", 3);
		
		System.out.println(c1.getName());
		System.out.println(c1.getStudentNo());
	}
}
