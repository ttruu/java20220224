package chap06.lecture.p04method;

public class App06 {
	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2();
		c1.sum();
		c1.sum(1);
		c1.sum(10,20);
		int sum = c1.sum(33,44,55,66,77);
		System.out.println(sum);
		
		
		c1.concat("java", "spring", "sql");
		c1.concat("a", "b");
		c1.concat("mysql");
		
	}
}
