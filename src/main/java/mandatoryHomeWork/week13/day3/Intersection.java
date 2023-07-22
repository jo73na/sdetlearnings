package mandatoryHomeWork.week13.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		int[] intersection = intersection(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
		 public static int[] intersection(int[] nums1, int[] nums2) {
		        Set<Integer> set1 = new HashSet<>();
		        for(int i:nums1){
		            set1.add(i);
		        }
		        Set<Integer> set3 = new HashSet<>();
		        for(int i=0;i<nums2.length;i++){
		            if(set1.contains(nums2[i])) set3.add(nums2[i]);
		        }
		        int[] arr = new int[set3.size()];
		        int j=0;
		        for(Integer i:set3){
		            arr[j++] = i;
		        }
		        return arr;
    }

}
