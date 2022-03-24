package chap15.lecture.p01list;

import java.util.ArrayList;

public class App01 {
	public static void main(String[] args) {
		// List : 순서가 있고, 중복 저장 가능
		// 구현클래스 : ArrayList
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");
		list1.add("jsp");
		
		String e1 = list1.get(0);
		String e2 = list1.get(1);
		String e3 = list1.get(2);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// size() : 길이를 리턴하는 메소드
		int length = list1.size();
		System.out.println(length);
		
		// for loop 탐색
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		// 향상된 for 탐색
		for(String str : list1) {
			System.out.println(str);
		}
		
		
	}
}
