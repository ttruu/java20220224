package chap07.book.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입변환
		parent.method1();
		parent.method2(); // 재정의 된 메소드 호출
	//	parent.method3(); // 호출 불가능
	}
}
