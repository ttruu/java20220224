package chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // 참조값 비교
		
		System.out.println(s1.equals(s2)); // 내용물 비교
		
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s3 == s4); // 참조값 비교
		// true 나옴 왜?
		// new 를 써서 만들지 않으면 같은 참조값으로 생성됨
		// 항상 string 비교할 때는 equals를 써야한다
	}
}
