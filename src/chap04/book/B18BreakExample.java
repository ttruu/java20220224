package chap04.book;

public class B18BreakExample {
	public static void main(String[] args) {
		
//		while(true) {
//			int num = (int)(Math.random()*6) + 1;
//			System.out.println(num);
//			
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//	}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("hello");
				if(i == 0) {
					break;
				}
			}
		}
}
}
