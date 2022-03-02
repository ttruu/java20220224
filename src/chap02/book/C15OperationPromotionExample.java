package chap02.book;

public class C15OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2 
		// 값이 정수값이기 때문에 byte 계산 안됨
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		// 컴파일 에러! 강제 형변환이 있어야 한다
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4); // 2
		
		int intValue5 = 10;
	//	int intValue6 = 10 / 4.0;
		// 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
	}
}
