package chap11.book.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		// parse... 은 포장해주는 메소드
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
