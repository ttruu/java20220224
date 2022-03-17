package chap08.book.s080701;

public interface MyInterface {
	public void method1();
	
	default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
