package chap06.lecture.p04method;

public class App03 {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.execute("game");
		c1.execute("excel");
		
		c1.update("calculate");
		c1.update("windows");
		
		c1.add(3, 5);
		c1.add(10, 20);
		// c1.add(3.15, 2.0); // double type은 안됨
		c1.add('c', 'a');
	}
}
