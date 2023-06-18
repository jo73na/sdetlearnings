package mandatoryHomeWork.week1.day2;

public class DiamondShapePattern {

	public static void main(String[] args) {
		
		pattern11(5);
	}

	static void pattern11(int n) {
		System.out.println("Pattern11----------------");
		for (int row = 1; row <= 2 * n; row++) {
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
