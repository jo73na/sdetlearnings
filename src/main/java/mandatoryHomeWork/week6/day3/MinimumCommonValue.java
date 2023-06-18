package mandatoryHomeWork.week6.day3;

public class MinimumCommonValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };
		int common = getCommonNew(nums1, nums2);
		System.out.println(common);
	}

	public static int getCommon(int[] nums1, int[] nums2) {

		for (int i = 0; i < nums1.length; i++) {
			int j = 0;
			for (; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					return nums1[i];
				}

			}

		}

		return -1;

	}

	public static int getCommonNew(int[] nums1, int[] nums2) {

		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] == nums2[j]) {
				return nums1[i];
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				i++;
			}

		}

		return -1;

	}
}
