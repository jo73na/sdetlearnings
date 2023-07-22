package classRoom;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashingSixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 3, 4, 3, 5, 6, 3, 4, 4 };
		int firstRepeatingIndex = findFirstRepeatingElementLinked(arr);
		System.out.println("Index of the first repeating index: " + firstRepeatingIndex);

	}

	public static int findFirstRepeatingElement(int[] arr) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		int maxFreq = 0;
		int minIndex = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (!freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.getOrDefault(freqMap, 0) + 1);
			} else {
				int frequency = freqMap.get(arr[i]);
				freqMap.put(arr[i], frequency + 1);
				if (frequency + 1 > maxFreq) {
					maxFreq = frequency + 1;
					minIndex = freqMap.get(arr[i]);
				} else if (frequency + 1 == maxFreq && freqMap.get(arr[i]) < minIndex) {
					minIndex = freqMap.get(arr[i]);
				}
			}
		}
		System.out.println("Max repeat : ");
		return minIndex != Integer.MAX_VALUE ? minIndex : -1;
	}

	public static int findFirstRepeatingElementLinked(int[] arr) {
		Map<Integer, Integer> freqMap = new LinkedHashMap<>();
		int maxFreq = Integer.MIN_VALUE;
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
			maxFreq = (maxFreq > freqMap.getOrDefault(num, 0)) ? maxFreq : freqMap.getOrDefault(num, 0);
		}

		Integer maxValue = Collections.max(freqMap.values());
		System.out.println("find max value no inbuilt: " + maxFreq);
		System.out.println("find max value use collection: " + maxValue);
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			count++;
			if (entry.getValue() == maxValue) {
				System.out.println("find max repeated key : "+entry.getKey());
				return count;
			}
		}

		return -1;
	}

}
