package chap06.book.s061303.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // private 같은 클래스 내에서만 접근 가능
		
		a.method1();
		a.method2();
//		a.method3(); // private 같은 클래스 내에서만 접근 가능
	}
}
