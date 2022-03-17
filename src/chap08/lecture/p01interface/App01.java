package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);
		
//		MyInterface2.field1 = 33; // xx
//		MyInterface2.field2 = 99; // xx
		// final 이어서 값을 다시 주는 것이 안됨
		
	
		// new 생성 안됨
//		MyInterface2 o1 = new MyInterface2(); 
		// 인터페이스로 인스턴스 만들 수 없음
		
	}
}
