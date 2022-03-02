package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i =0; i < 3; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		// for문 안에서 선언된 i를 밖에서 사용하는 건 안됨
		// 사용하려면 for문 이전에 변수를 선언해주면 됨
		
	}
}
