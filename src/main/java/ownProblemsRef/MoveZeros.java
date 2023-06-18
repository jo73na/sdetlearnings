package ownProblemsRef;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {0,1,0};
		name(nums);
	}
	
	public static void name(int[] num) {
		int s=0;
		int e=0;
		if(num.length<=1){
			return;
		}
		for(;s<num.length;s++) {
			if(num[s]!=0) {
				swap(num,s,e);
				e++;
			}
		}
		System.out.println(Arrays.toString(num));
	}
	private static void swap(int[] arr, int s, int e) {
		int t=arr[s];
		arr[s]=arr[e];
		arr[e]=t;
				
			}

}
