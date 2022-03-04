package chap05.lecture.reftype;

public class C06ReferencType {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 2, 1};
		method1(arr1);
		System.out.println(arr1[0]);
		
		int[] arr2 = new int[] {-3, -2, -1};
		method1(arr2);
		System.out.println(arr2[0]);
	}
	
	public static void method1 (int[] arr) {
		arr[0] = 30;
		
		// 인스턴스에 같은 값이 저장되는 것이기 때문에
		// 값이 변한다 
	}
}
