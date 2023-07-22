package meetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1,2,3,3};
		int[] nums2 = {1,1,2,2};
		List<List<Integer>> findDifference = findDifference(nums1, nums2);
	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hm1 = new HashMap<>();
		HashMap<Integer, Integer> hm2 = new HashMap<>();
		List<List<Integer>> ansList = new ArrayList<>();
		Set<Integer> s1= new HashSet<>();
		Set<Integer> s2= new HashSet<>();
		List<Integer> tempList = new ArrayList<>();
		List<Integer> tempList2 = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			hm1.put(nums1[i], hm1.getOrDefault(nums1[i], 0) + 1);
		}
		System.out.println(hm1);

		for (int i = 0; i < nums2.length; i++) {
			hm2.put(nums2[i], hm2.getOrDefault(nums2[i], 0) + 1);
		}
		System.out.println(hm2);
		for (Integer integer : nums1) {
			if(!hm2.containsKey(integer) ) {
				s1.add(integer);
			}
		}
		
		for (Integer integer : nums2) {
			if(!hm1.containsKey(integer) ) {
				
				s2.add(integer);
			}
		}
		tempList.addAll(s1);
		tempList2.addAll(s2);
		ansList.add(tempList);
		ansList.add(tempList2);
		System.out.println(ansList);
		return ansList;
		
		

	}

}
