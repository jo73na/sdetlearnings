package mandatoryHomeWork.week1.day1;

public class PyramidPattern {

	public static void main(String[] args) {
	
		pattern9(5);
	}

	

	static void pattern9(int n) {
		System.out.println("Pattern9----------------");
		for (int row = 1; row <= n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			int totalSpace = n - totalCol;
			for (int space = 1; space <= totalSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	
}
