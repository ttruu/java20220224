package chap02.lecture;

public class C10TypeConversion {
	public static void main(String[] args) {
		float f1 = 9000.1234F;
		double d1 = 1200000000.1234;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2;
		double d2;
		
		f2 = f1;
		d2 = f1;
		System.out.println(f2);
		System.out.println(d2);
		
		f2 = (float) d1; // not ok -> type casting
		d2 = d1;
		System.out.println(f2);
		System.out.println(d2);
	}
}
