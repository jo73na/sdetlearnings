package mandatoryHomeWork.week6.day4;

import java.util.Arrays;

public class MatrixObtainedByRotation1886 {
	
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] mat1 = { { 0, 1 }, { 1, 0 } }, target2 = { { 1, 0 }, { 0, 1 }, };

		findRotation(mat1, target2);
		System.out.println(flag);
	}
	static boolean flag = false;
	 public static boolean findRotation(int[][] mat, int[][] target) {
     	rept(mat, target, 0);
		display(target);
		
     return flag;
 }

	public static void rept(int[][] mat, int[][] target, int count) {
	if(count<4)	{
			boolean f = false;
			System.out.println("--------rept-----> " + count);
			display(mat);
			int[][] transpose = transpose(mat);
			int[][] ans = reverse(transpose);
		//	display(ans);
		//	display(target);
			// boolean check = check(ans, target);
			// System.out.println(check);
			if (check(ans, target)) {
				System.out.println("inside if true");
				flag = true;
				return;

			} else {
				count++;
				rept(ans, target, count);
			}

		}
	//flag=false;
	return;
	}

	public static int[][] reverse(int[][] mat) {
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			int left = 0;
			int right = len - 1;
			while (left < right) {
				swap(mat, i, left, right);
				left++;
				right--;
			}

		}
		return mat;
	}

	private static int[][] transpose(int[][] mat) {
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				{
					swap(mat, i, j);

				}

			}

		}
		return mat;
	}

	private static void swap(int[][] mat, int i, int l, int r) {
		int temp = mat[i][l];
		mat[i][l] = mat[i][r];
		mat[i][r] = temp;

	}

	private static void swap(int[][] mat, int row, int col) {
		int temp = mat[row][col];
		mat[row][col] = mat[col][row];
		mat[col][row] = temp;

	}

	private static void display(int[][] mat) {
		// TODO Auto-generated method stub

		for (int[] x : mat) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	public static boolean check(int[][] m1, int[][] m2) {
		return Arrays.deepEquals(m1, m2);

	}

}
