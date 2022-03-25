package chap14.lecture.p01lambda;

public class App04 {

}


// functional interface : 추상메소드가 1개인 인터페이스
// functional interface가 메소드가 한개인지 여러개인지 구별해줌
// 이것만 람다식으로 구현이 가능
@FunctionalInterface
interface MyInterface41 {
	void method1();
}

//@FunctionalInterface
interface MyInterface42 {
	void method2();
	void method3();
}

//@FunctionalInterface
interface MyInterface43 {
	
}