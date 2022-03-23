package chap11.lecture.p04math;

import static java.lang.Math.*;

public class App02 {
	public static void main(String[] args) {
		
		Math.abs(-10);
		
		// import static
		abs(-20); // static member를 import해줬기 때문에 Math.을 생략할수 있다
		min(3, 5);
		max(1, 2);
		
	/*	
	int i1 = Math.abs(-10);
		
		// import static
		int i2 = abs(-20); // static member를 import해줬기 때문에 Math.을 생략할수 있다
		int i3 = min(3, 5);
		int i4 = max(1, 2);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		*/
	}
}
