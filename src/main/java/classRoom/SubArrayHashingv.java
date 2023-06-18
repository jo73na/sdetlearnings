package classRoom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SubArrayHashingv {

	public static void main(String[] args) {
		int arr[] = { 10, 15, -5, 15, -10, 0 };
		name(arr, 5);

	}

	public static void name(int[] arr, int desSum) {

		int sum = 0;
		int pos = 0;
		int removePos = 0;
		int startOutPos = -1;
		int endOutPos = -1;
		HashMap<Integer, Integer> str = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			pos = i;
			str.put(pos, sum);
		}
		int check = sum - desSum;
		System.out.println("check value: " + check + " i :" + pos);
		boolean containsKey = str.containsValue(check);
		if (containsKey) {
			int endVal=sum;
			for (Entry<Integer, Integer> entry : str.entrySet()) {
				if (entry.getValue().equals(check)) {
					startOutPos = (entry.getKey())+1;
					System.out.println(removePos);
				//	startOutPos = removePos + 1;

				}
				
					

				}
			for (Map.Entry<Integer, Integer> entry : str.entrySet()) {
				if (entry.getValue().equals(sum)&& entry.getValue()>startOutPos) {
				endOutPos= entry.getKey();
					
					
					
				}
				
				
			}
			
				
				
			}
			System.out.println("index : " + startOutPos + "," + endOutPos);
			}
		}
		

	


