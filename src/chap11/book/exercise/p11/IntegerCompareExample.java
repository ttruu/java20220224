package chap11.book.exercise.p11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2); // 쓰면 안된다
		System.out.println(obj3 == obj4); // equals 메소드를 써라
	}
}
