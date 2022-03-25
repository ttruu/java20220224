package chap99.codingbat;

import java.util.List;

public class Functional1 {

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(e -> e * 2);

		return nums;

	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(a -> a * a);
		return nums;
	}

	public List<String> addStar(List<String> strings) {

		strings.replaceAll(a -> a + "*");

		return strings;

	}

	public List<String> copies3(List<String> strings) {
		//		strings.replaceAll(a -> a + a + a);
		//			return strings;

		strings.replaceAll(a -> {
			String result = "";
			for (int i = 0; i < 3; i++) {
				result += a;
			}
			return result;
		});

		return strings;
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(a -> "y" + a + "y");

		return strings;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(a -> (a + 1) * 10);

		return nums;
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(a -> (a % 10));

		return nums;
	}

	public List<String> lower(List<String> strings) {
		//for (int i = 0; i < strings.size(); i++) {
		//		String e = strings.get(i);
		//
		//		strings.set(i, e.toLowerCase());
		//		}
		strings.replaceAll(a -> a.toLowerCase());

		return strings;
	}

	public List<String> noX(List<String> strings) {
		// for (int i = 0; i < strings.size(); i++) {
		//   String r = strings.get(i);
		//   r = r.replace("x", "");

		//   strings.set(i, r);
		// }  
		strings.replaceAll(a -> a.replace("x", ""));

		return strings;

	}

}