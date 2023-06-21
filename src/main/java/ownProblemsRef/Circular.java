package ownProblemsRef;

public class Circular {

	public static void main(String[] args) {

	}
	public void rotate(int[] nums, int k) {
		k = k % nums.length;
		swap(nums, 0, nums.length - 1);
		swap(nums, 0, k - 1);
		swap(nums, k, nums.length - 1);

	}
	/*
	 * 
	*/
	private void swap(int[] arr, int i, int j) {
		while(i<j) {
		 int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
		i++;
		j--;
		}
	}
}
