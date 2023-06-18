package ownProblemsRef;

//A simple Java program to
//count pairs with difference k
import java.util.HashMap;
import java.util.Map;

class KpairDiff {

	static int countPairsWithDiffK(int arr[], int n, int k) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if (arr[i] - arr[j] == k || arr[j] - arr[i] == k)
					count++;
		}
		return count;
	}

	public static int pairsPrj(int[] ProjectCosts, int target) {
		int count = 0;
		Map<Integer, Integer> hm = new HashMap<>();

		for (int cost : ProjectCosts) {
//			arr[i] - arr[j] == k || arr[j] - arr[i] == k)->arr[i] - k=arr[j]   || arr[j]  -k= arr[i])
			int cost1 = cost - target;
			int cost2 = cost + target;

			count += (hm.get(cost1) != null) ? hm.get(cost1) : 0;
			count += (hm.get(cost2) != null) ? hm.get(cost2) : 0;

			hm.put(cost, ((hm.get(cost) != null) ? hm.get(cost) : 0) + 1);
		}

		return count;
	}

	

	public static void main(String args[]) {
		int arr[] = { 1, 5, 3, 4, 2 };
		int n = arr.length;
		int k = 3;
		System.out.println("Count of pairs with given diff is " + pairsPrj(arr, 2));
	//	System.out.println("two ptr Count of pairs with given diff is " + pairsTwoPointer(arr, 2));
	}
}
