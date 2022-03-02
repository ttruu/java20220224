package chap03.book.excercise;

public class B11InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
