package chap07.lecture.p07abstract;

// canine chihuahua jindodog

public class App01 {
	public static void main(String[] args) {
		Canine c1 = new Chihuahua();
		Canine c2 = new JindoDog();
//		Canine c3 = new Canine(); // 추상클래스로 인스턴스 만들 수 없음
		
		
		c1.play();
		c2.play();
		
		c1.bark();
		c2.bark();
		
		method(c1);
		method(c2);
	}
	
	public static void method(Canine dog) {
		dog.play();
		dog.bark();
	}
	
	
}
