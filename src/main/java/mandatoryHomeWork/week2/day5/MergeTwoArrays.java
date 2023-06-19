package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }; //n1=n2+n2
		int[] nums2 = { 2, 5, 6 };
		int m = nums2.length-1;
		int n = nums2.length-1;
		;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));

	}
	
	// 1,2,3,0,0,0
	//       p1     p3
	// 2,5,6
    // 	  p2
	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p3 = m + n + 1; 
		int p1 = m;
		int p2 = n ; 
		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] >= nums2[p2]) {
				nums1[p3] = nums1[p1];
				p1--;
			} else {
				nums1[p3] = nums2[p2];
				p2--;
			}
			p3--;
		}


		while (p2 >= 0) {
			nums1[p3] = nums2[p2];
			p2--;
			p3--;
		}
	}

}
