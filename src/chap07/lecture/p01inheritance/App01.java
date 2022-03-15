package chap07.lecture.p01inheritance;

// Computer, QuantumComputer 에서 사용

public class App01 {
	public static void main(String[] args) {
		
		Computer com1 = new Computer();
		com1.cpu = "펜티엄";
		com1.ram = "32g";
		com1.ssd = "1tb";
		
		com1.executeGame();
		
		QuantumComputer com2 = new QuantumComputer();
		// cpu ram ssd 는 QuantumComputer에 없는 필드 이지만
		// Computer를 부모로 받았기 때문에 불러올 수 있는 것 
		com2.cpu = "양자cpu";
		com2.ram = "1tb";
		com2.ssd = "32tb";
		com2.executeGame();
		com2.executeQuantum();
		
	}
}
