package chap04.book.exercise;

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------");
			System.out.print("선택 > ");
			
			int num1 = scanner.nextInt();
//			int money = 0;

			if (num1 == 1) {
				System.out.print("예금액 > ");
				balance += scanner.nextInt();
				//balance += money;
				
			} else if (num1 == 2) {
				System.out.print("출금액 > ");
				balance -= scanner.nextInt();
				//balance -= money;
				
			} else if (num1 == 3) {
				System.out.println("잔고 > " + balance);
				
			} else {
				break;			
				} 
			
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
