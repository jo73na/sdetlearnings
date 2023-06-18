package classRoom;

import java.util.Arrays;

public class MergeSortTwoArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3}; 
		int[] nums2 = { 2, 5, 6 };
	//	merge(nums1, nums2);

	}
	public static void merge(int[] nums1, int[] nums2, int[] nums3) {
		int fLen = nums1.length;
		int sLen = nums2.length;
		int p3 = fLen + sLen ; 
		System.out.println(p3);
		int[] num3= new int[p3];
		
		int p1 = fLen;
		int p2 = sLen ; 
		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] >= nums2[p2]) {
				num3[p3] = nums1[p1];
				p1--;
			} else {
				num3[p3] = nums2[p2];
				p2--;
			}
			p3--;
		}


		while (p2 >= 0) {
			num3[p3] = nums2[p2];
			p2--;
			p3--;
		}
		System.out.println(Arrays.toString(num3));
	}

}
