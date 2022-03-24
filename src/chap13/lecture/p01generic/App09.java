package chap13.lecture.p01generic;

import java.util.ArrayList;
import java.util.List;

import chap08.lecture.p01interface.example_class.*;

public class App09 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<Pet>();
		list1.add(new Chihuahua());
		method(list1);
		
		ArrayList<Chihuahua> list2 = new ArrayList<Chihuahua>();
		list2.add(new Chihuahua());
		method(list2); 
		// pet이랑 Chihuahua랑 상하위 타입이 아님 자동타입변환 xxx
		
		ArrayList<Cat> list3 = new ArrayList<Cat>();
		list3.add(new Cat());
		method(list3);
		
	}
	
	// ? : wild card
	public static void method(ArrayList<? extends Pet> param) {
		param.get(0).roll(); // Pet의 roll 메소드
	}
	
	
}
