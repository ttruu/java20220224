package chap04.book.exercise;

public class E061 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 거꾸로
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < (i + 1); j++) {
				// for (int i = 0; i < 5; i++) 
				// for (int j = 0; j < (5 - i); j++)
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		// 거꾸로 반대
		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		
		// 반대로 쌓기
		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k < (4 - i); k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

