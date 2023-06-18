package ownProblemsRef;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, target = { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } };

	

	
		for (int[] x : mat)
		{
		   for (int y : x)
		   {
		        System.out.print(y + " ");
		   }
		   System.out.println();
		}
	}
	
	private static void transpose(int[][] mat) {
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			for(int j = i+1; j< len; j++){
					 {
						swap(mat, i, j);

					}
				
				}

			}
	}

	private static void swap(int[][] mat, int row, int col) {
		System.out.println("swap");
		int temp = mat[row][col];
		mat[row][col] = mat[col][row];
		mat[col][row] = temp;

	}

}
