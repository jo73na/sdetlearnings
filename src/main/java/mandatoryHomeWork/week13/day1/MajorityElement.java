package mandatoryHomeWork.week13.day1;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] check= {3,2,3};
		int[] check1={2,2,1,1,1,2,2,3,3,3,3,3};
System.out.println(majorityElement(check1));
	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int posTimes, maxPosTimes = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
			posTimes = hm.getOrDefault(nums[i], 0);
			maxPosTimes = (posTimes > maxPosTimes) ? posTimes : maxPosTimes;
		}

		for (Entry<Integer, Integer> ent : hm.entrySet()) {
			if ( ent.getValue()==(maxPosTimes)) {
				return ent.getKey();
			}
		}
		return -1;
	}

}
