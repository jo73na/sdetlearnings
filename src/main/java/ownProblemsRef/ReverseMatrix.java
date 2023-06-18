package ownProblemsRef;

import java.util.Arrays;

public class ReverseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = {{1,2,3},
							  {4,5,6},
							  {7,8,9}}, 
				target = {{1,1,1},
								{0,1,0},
								{0,0,0}};
	
		
	//	for(int i=0;i<len;i++) 

	
	//	System.out.println(Arrays.toString(mat));

	}
	public static void reverse(int[][] mat) {
		int len =mat.length;
		for(int i=0;i<len;i++) {
			int left = 0;
			int right = len - 1;
			while (left < right) {
				swap(mat, i, left, right);
				left++;
				right--;
			}
			
		}
	}
	
	private static void dis(int[][] mat) {
		// TODO Auto-generated method stub
		
		for (int[] x : mat)
		{
		   for (int y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}

	private static void swap(int[][] mat, int i, int l,int r) {
		int temp=mat[i][l];
		mat[i][l]=mat[i][r];
		mat[i][r]=temp;
		
		
	}

}
