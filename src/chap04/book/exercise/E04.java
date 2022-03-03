package chap04.book.exercise;

public class E04 {
	public static void main(String[] args) {
		
		boolean more = true;
		
		while(more) {
			
			int a = (int)(Math.random()*6) + 1;
			int b = (int)(Math.random()*6) + 1;
		
			System.out.println("(" + a + ", " + b + ")");
			
			if((a + b) == 5) {
				more = false;
			}
		}
	}
}
