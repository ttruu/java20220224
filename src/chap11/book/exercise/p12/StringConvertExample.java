package chap11.book.exercise.p12;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = Integer.toString(intData2);
		String strData3 = ""+intData2;
		String strData4 = String.valueOf(intData2);
		
		System.out.println(intData1);
		System.out.println(strData2);
	}
}
