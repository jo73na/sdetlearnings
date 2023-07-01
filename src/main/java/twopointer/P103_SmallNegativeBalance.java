package twopointer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.h;

public class P103_SmallNegativeBalance {

	public static void main(String[] args) {
		String[] input = { "Alex Blake 2", "Blake Alex 2", "Cassey Alex 5", "Blake Cassey 7", "Alex Blake 4",
				"Alex Cassey 4" };
		smallNegativeBalance(input);
	}

	public static void smallNegativeBalance(String[] input) {
		Map<String, Integer> hm = new HashMap<>();
		for (String string : input) {
			String[] split = string.split(" ");
			String br = split[1];
			String ln = split[0];
			int val = Integer.valueOf(split[2]);
			hm.put(ln, hm.getOrDefault(ln, 0) + val);
			hm.put(br, hm.getOrDefault(br, 0) - val);
		}
		System.out.println(hm);
		Integer min = Collections.min(hm.values());
		System.out.println(min);
	}
}
