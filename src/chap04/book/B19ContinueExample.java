package chap04.book;

public class B19ContinueExample {
	public static void main(String[] args) {
		
//		for(int i = 1; i<=10; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		for(int i = 0; i < 5; i++) {
			if(i > 3) {
				continue;
			}
			System.out.println("java");
		}
	}
}
