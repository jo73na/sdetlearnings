package classRoom;

public class SlidingWindowProblem {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 3, 7, 1 };
		int arr1[] = { 0, 0, 0, 0, 0, 0 };
		int arr2[] = { 1,2 };
		int arr3[] = { 1, 5, 2 };
		int arr4[]={ -1, -5, -2, -3, -7, -1 };
		int maxSum = maxSum(arr4, 3);
		System.out.println(maxSum);

	}

	public static int maxSum(int[] arr, int k) {
		if( arr.length<k) {
			return-1;
		}
		// to store all sum
		int sum = 0;
		// to store max value
		int max = 0;
		// first calculate the window size alone and store in
		for (int i = 0; i < k; i++) {
			max += arr[i];
			// max=6
		}

		// store the same max value in the sum so that
		// we can subtract first element and add anoher at the end of K
		// sum=6
		sum = max;
		// i=3 i<array length
		for (int i = k; i < arr.length; i++) {
			// sum+=arr[3]-arr[3-3]
			// sum+=arr[4]-arr[4-3]=>sum+=arr[4]-arr[1];

			// sum=>6+=3-1
			sum += arr[i] - arr[i - k];
			// max=if(6>=8){max=max}else{max=sum}
			// max=>sum
			max = (max >= sum) ? max : sum;
		}

		return max;

	}

}
