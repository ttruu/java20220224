package chap11.book.s111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// 대입 시 자동 Unboxing
		int value = obj;
		System.out.println(value);
		
		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println(result);
	}
}
