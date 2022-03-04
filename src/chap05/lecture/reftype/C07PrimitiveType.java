package chap05.lecture.reftype;

public class C07PrimitiveType {
	public static void main(String[] args) {
		int i1 = 3;
		method1(i1);
		System.out.println(i1);
	}
	
	public static void method1(int i) {
		i = 300;
		
		// int 기본값은 인스턴스에 저장되지 않기 때문에 
		// 값이 바뀌지 않음
	}
}
