package chap11.lecture.p01object;

public class App03 {
	public static void main(String[] args) {
		Object o1 = new Computer("i5", "16g", 500000);
		Object o2 = new Computer("i7", "8g", 600000);
		
		// toString 메소드로 인해 값이 보여지게 됨
		System.out.println(o1);
		System.out.println(o2);
	}
}

class Computer {
	
	private String cpu;
	private String ram;
	private int price;
	
	public Computer(String cpu, String ram, int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
	
	
}