package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App06 {
	public static void main(String[] args) {
		// List 탐색 방법
		
		List<String> list1 = new ArrayList<>();
		list1.add("spring");
		list1.add("java");
		list1.add("hello");
		list1.add("lunch");
		
		// 그냥 for
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		// 향상된 for
		System.out.println("향상된 for");
		for(String element : list1) {
			System.out.println(element);
		}
		
		System.out.println();
		
		// foreach
		System.out.println("#forEach");
		list1.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		// Interator
		System.out.println("#Iterator");
		Iterator<String> iter = list1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
