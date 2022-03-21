package chap10.book.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		/*
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println(data1);
		System.out.println(data2);
		*/
		// ArrayIndexOutOfBoundsExceptionExample 
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println(data1);
			System.out.println(data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
	}
}
