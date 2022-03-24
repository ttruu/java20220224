package chap13.book.s1304;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
