package chap07.book.exercise.p05;

public class Parent {
	
//	public String name;
	private String name; // 이게 더 잘 쓰임
	
	public Parent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
