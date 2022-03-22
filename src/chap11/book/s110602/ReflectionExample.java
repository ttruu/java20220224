package chap11.book.s110602;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		
		Class clazz = Class.forName("chap11.book.s110602");
		
		System.out.println("클래스 이름");
		System.out.println(clazz.getName());
		System.out.println();
	} 
}
