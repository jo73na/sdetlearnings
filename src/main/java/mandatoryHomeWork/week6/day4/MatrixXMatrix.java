package mandatoryHomeWork.week6.day4;

public class MatrixXMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 1, 0, 2 } };

		int[][] grid1 = { { 5, 0, 0, 1 }, { 0, 4, 1, 5 }, { 0, 5, 2, 0 }, { 4, 1, 0, 2 } };

		boolean checkXMatrix = checkXMatrix(grid);
		System.out.println("Whl :" + checkXMatrix);
	}

	public static boolean checkXMatrix(int[][] mat) {
		if (mat[0].length <= 1) {
			return false;
		}

		int len = mat[0].length;
		boolean otherEle = true;
		boolean flagDia = true;
		for (int i = 0; i < len * len; i++) {
			System.out.print(i + "<-i-len->" + len);
			int row = i / len;
			int col = i % len;
			System.out.println("->(" + row + "," + col + ") : " + mat[row][col]);
			if (row == col || col == len - 1 - row) {

				flagDia = ((mat[row][col] != 0)) ? true : false;
				// System.out.println("dia: " + flagDia);

				if (!flagDia) {
					break;
				}

			} else {
				otherEle = ((mat[row][col] == 0)) ? true : false;
				// System.out.println("nondia: " + otherEle);
				if (!otherEle) {
					break;
				}

			}

		}

		System.out.println("Dia :" + flagDia);
		System.out.println("otr :" + otherEle);

		return (otherEle && flagDia);

	}

}
