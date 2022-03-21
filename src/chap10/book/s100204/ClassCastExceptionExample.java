package chap10.book.s100204;

import chap08.book.exercise.p03.*;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		
		//if(animal instanceof Dog) { // instance2of 로 타입 체크 먼저 하는 것이 좋다
			Dog dog = (Dog) animal; // ClassCastException 발생 가능
		//}
		
	}
}
	class Animal{}
	class Dog extends Animal{}
	class Cat extends Animal{}

