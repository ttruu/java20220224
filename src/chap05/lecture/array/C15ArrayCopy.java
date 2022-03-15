package chap05.lecture.array;

import java.util.Arrays;

public class C15ArrayCopy {
	// 그림 : 참조타입 8번
	public static void main(String[] args) {
		int[][]  a = {{9,10}, {3,4}};
		int[][]  b = Arrays.copyOf(a, a.length);
		
		b[0][0] = 999;
		System.out.println(a[0][0]);
}
	
	
//	int[] a = new int[2];
//	int[] b = a;
//	
//	a[0] = 7;
//	a[1] = 3;
//	
//	System.out.println(b[0]+b[1]);
}
