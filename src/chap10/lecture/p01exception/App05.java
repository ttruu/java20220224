package chap10.lecture.p01exception;

public class App05 {
	public static void main(String[] args) {
		
		// ArithmethicException
		int i = 5;
		int j = 0;
		
		if (j != 0) {
		System.out.println(i / j); // ArithmeticExcepiton
		}
		System.out.println("프로그램 실행 계속");
	}
}
