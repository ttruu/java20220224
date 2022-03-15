package chap07.lecture.p01inheritance;

// SuperClass1, subClass1 의 app02

public class App02 {
	public static void main(String[] args) {
		
		SuperClass1 o1 = new SuperClass1();
		o1.setField("필드값");
		System.out.println(o1.getField());
		o1.someMethod();
		
		
		// 얘도 인스턴스 필드가 없지만
		// SuperClass1에서 가져와서 자기 것으로 사용할 수 있는 것임
		SubClass1 o2 = new SubClass1();
		o2.setField("서브클래스 인스턴스 필드값");
		System.out.println(o2.getField());
		o2.someMethod();
		
	}
}
