package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {
	
	@Override
	public void method1() {
		// super : 상위 클래스 멤버에 접근하기 위해 사용
		// 순서 상관없음
		super.method1();
		System.out.println("서브클래스2의 메소드1이 하는 일..");
	}
}
