package mandatoryHomeWork.week6.day2;

public class MatrixDiagonal1572 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat1 = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

		int diagonalSum = diagonalSum(mat);
		System.out.println(diagonalSum);
	}

	public static int diagonalSum(int[][] mat) {
		int len = mat[0].length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (i == len - 1 - i) {
				sum += mat[i][i];
			} else {
				sum += mat[i][i] ;
				sum+= mat[i][len - 1 - i];
			}
		}
		return sum;
	}

}
