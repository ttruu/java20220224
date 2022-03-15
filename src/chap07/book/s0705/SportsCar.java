package chap07.book.s0705;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*
	stop() 메소드 오버라이딩 못함
	*/
}
