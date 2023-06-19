package mandatoryHomeWork.week3.day1;

public class MaxAvgSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// nums = [1,12,-5,-6,50,3], k = 4
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double findMaxAverage = findMaxAverage(nums, k);
		System.out.println(findMaxAverage);
	}

	public static double findMaxAverage(int[] arr, int k) {
		double maxAvg = Integer.MIN_VALUE;
		double currentAvg = 0;
		double currentSum = 0;
		// iterate the array.
		// adding the elements for window size
		// keeping check at the window.
		// Calculating Average.
		// Storing the maxAvg.
		// Substract the first element of the prev window.
		for (int i = 0; i < arr.length; i++) {

			currentSum += arr[i];
			System.out.println(i + " :***************: " + (k - 1));
			if (i > k - 1) {
				currentAvg = currentSum / k;
				if (maxAvg < currentAvg) {
					maxAvg = currentAvg;
				}
				System.out.println(i + " - " + (i - (k - 1)) + "= "+( i-(i - (k - 1))));
				currentSum -= arr[i - (k - 1)];
			}
		}
		return maxAvg;
	}

}
