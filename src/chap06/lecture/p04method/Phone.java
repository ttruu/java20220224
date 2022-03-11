package chap06.lecture.p04method;

public class Phone {
	
	// method overloading : 메소드명이 같은 메소드를 여러개 만들수 있다
	// 같은 메소드명을 가져도
	// 파라미터의 타입, 개수, 순서로 구분됨
	
	// 참고: 7장에서 나오는 용어 method overriding과 용어가 비슷해서
	// 면접에서 자주 물어봄
	
	// 이름은 같지만 서로 다른 메소드 이다 : call
	void call(String name) {
		System.out.println(name + "ㅇㅔ게 전화검");
	}
	
	void call (int number) {
		System.out.println(number + "로 전화검");
	}
	
	void call (String name, int number) {
		System.out.println();
	}
	
	void call (int number, String name) {
		
	}
	
	/*
	int call(int number) {
		return 0;
	}
	*/ //안됨 리턴타입이 달라도 이름 순서가 같음 
}
