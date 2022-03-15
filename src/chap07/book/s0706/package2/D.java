package chap07.book.s0706.package2;

import chap07.book.s0706.package1.A;

public class D extends A {
	
	public D() {
		super();
		this.field = "value";
		this.method();
		
		// 같은 패키지에 있지 않아도
		// D가 A의 자식 클래스이기 때문에 
		// 접근 가능하다
		// 단 new연산자를 사용해 생성자를 직접 호출할순 없다
		// super() 로 A 생성자 호출 가능함
	}

}
