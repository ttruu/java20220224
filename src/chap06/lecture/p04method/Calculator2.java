package chap06.lecture.p04method;

public class Calculator2 {
	
	// varargs (가변길이 매개변수)
	// 파라미터에 붙은 '...'
	int sum(int... nums) {
		
		System.out.println("nums의 길이: " + nums.length);
		
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	int varSum(String name, int... nums) {
		return 0;
	}
	
	
	public void concat(String... str) {
		
		for(String str1 : str) {
			System.out.print(str1);
		}
		System.out.println();
		
	}
}
