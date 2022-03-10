package chap06.lecture.p03constructor;

public class Computer {
	String cpu;
	String ram;
	String ssd;
	
	// 생성자는 여러개 작성 가능
	// 생성자의 파라미터의 수, 타입, 순서가 달라야함
	Computer(String cpu, String ram, String ssd) {
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
	}
	
	Computer(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}
	
	/* 파라미터 수와 타입이 같음 안됨
	Computer(String ram, String ssd) {
		this.ram = ram;
		this.ssd = ssd;
	}
	*/
	
	Computer(String ssd) {
		this.ssd = ssd;
	}
	
	Computer(int price) {
		
	}
	
	Computer(String cpu, int price) {
		
	}
	
	Computer(int price, String cpu) {
		
	}
}
