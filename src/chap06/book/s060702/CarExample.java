package chap06.book.s060702;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		// Car myCar = new Car(); // x
		// Car 클래스에 생성자 선언이 있기 때문에 기본생성자(Car())를 
		// 호출해서 객체를 생성할 수 없다.
	}
}
