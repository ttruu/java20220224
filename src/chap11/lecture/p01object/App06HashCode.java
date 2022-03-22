package chap11.lecture.p01object;

public class App06HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		// 같은 객체는 hashCode가 같아야 함
		// equals 와 hashCode 둘 다 같아야 동등 객체로 취급한다
	}
}
