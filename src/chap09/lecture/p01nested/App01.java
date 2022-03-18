package chap09.lecture.p01nested;

public class App01 {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		MyClass1.NestedClass2 o2 = new MyClass1.NestedClass2();
		// 인스턴스 중첩 클래스
		MyClass1.NestedClass1 o3 = o1.new NestedClass1(); 
	}
}
