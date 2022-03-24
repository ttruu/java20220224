package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		int sum = 0;
		
		for(Integer e : list ) {
			sum += e;
		}
		
		double avg = (double) sum / list.size();
		
		System.out.println(sum);
		System.out.println(avg);
		
		
	}
}
