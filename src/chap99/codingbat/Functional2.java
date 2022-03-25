package chap99.codingbat;

import java.util.List;

public class Functional2 {

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(a -> a < 0);
		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(a -> (a % 10) == 9);
		return nums;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(a -> (a >= 13) && (a <= 19));
		return nums;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(a -> a.contains("z"));
		return strings;
	}

	public List<String> noLong(List<String> strings) {
		// List<String> result = new ArrayList<>();

		// for (String str : strings) {
		//   if (str.length() < 4) {
		//     result.add(str);
		//   }
		// }

		// return result;
		strings.removeIf(a -> a.length() >= 4);
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(a -> (a.length() == 3) || (a.length() == 4));
		return strings;
	}

	public List<String> noYY(List<String> strings) {
		strings.replaceAll(a -> a + "y");
		strings.removeIf(a -> a.contains("yy"));

		return strings;
	}

	public List<Integer> two2(List<Integer> nums) {
		nums.replaceAll(a -> a * 2);
		nums.removeIf(a -> (a % 10) == 2);

		return nums;
	}
	
	

}
