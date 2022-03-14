package chap06.book.s061303.package2;

import chap06.book.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // default 같은 패키지 내에서만 접근 가능
//		a.field3 = 1; // private 같은 클래스 내에서만 접근 가능
		
		a.method1();
//		a.method2(); // default 패키지 내에서만 접근 가능
//		a.method3(); // private 같은 클래스 내에서만 접근 가능
	}
}
