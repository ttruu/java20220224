package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.*;

public class App05 {
	public static void main(String[] args) {
		Container5<Chihuahua> o1 = new Container5<>();
		o1.method(new Chihuahua());
		
		Container5<Cat> o2 = new Container5<>();
		o2.method(new Cat());
	}
}

// 제한된 타입 파라미터 (bounded type parameter)
class Container5<T extends Pet> {
	public void method(T param) {
		// 특정 타입만 받겠다고 명시할 수 있다
		// <T extends 특정타입>
		param.roll();
		
	}
}