package chap14.book.exercise.p04;

import java.util.function.IntSupplier;


public class LambdaExample {
	public static int method(int x, int y) {
//		IntSupplier supplier = () -> (x * 10) + y; // 쌤 코드
		
		IntSupplier supplier = () -> {
		//	x *= 10; // x = final or effectively final
			int result = (x * 10) + y;
			return result;
		};
		
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}
}
