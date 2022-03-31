package chap15.book.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 entry 수: "+ map.size()); // 저장된 총 entry 수 얻기
		
		System.out.println("홍길동" + map.get("홍길동")); // 키 값으로 점수를 검색
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동"); // Map.Entry를 제거 
		System.out.println(map.size());
		
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println(map.size());
		
	}
}
