package chap13.book.s1306;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;	
		
	}
	
	private String getName() {
		return name;

	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
