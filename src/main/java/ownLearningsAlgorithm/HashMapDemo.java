package ownLearningsAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
//set->map->value null
		String s = "abcdaef";

		Map<Character, Integer> hm = new HashMap<>();
		Map<Integer, Integer> hm1 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);

		}

		// key -value-> not primiti data-> object
		// -> key -> set->no dupli
		// 1,1,1,1
		/*
		 * hm.put(1, 100);// -> hm.put(1, 100); hm.put(1, 100);
		 * 
		 * System.out.println(hm.get(1)); System.out.println(hm.containsValue(100));
		 * System.out.println(hm.containsKey(1)); // hm.clear();
		 * System.out.println(hm.containsKey(1)); System.out.println("------" +
		 * hm.equals(hm1)); hm.put(1, 100); Set<Integer> keySet = hm.keySet();
		 * Set<Entry<Integer, Integer>> entrySet = hm.entrySet(); // entrySet
		 * 
		 * System.out.println("entry set :" + entrySet); for (Integer integer : keySet)
		 * { Integer integer2 = hm.get(integer); } // hm1.putAll(hm);
		 * System.out.println(hm.equals(hm1)); hm1.remove(1);
		 * System.out.println(hm1.isEmpty());
		 */

	}

	
}
