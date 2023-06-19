package mandatoryHomeWork.week3.day5;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,1}; int k = 3;
boolean containsNearbyDuplicate = containsNearbyDuplicate(nums, k);
System.out.println(containsNearbyDuplicate);
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int target) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.size() == target + 1) {
                hs.remove(nums[i - target - 1]);
            }
            if (!hs.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
