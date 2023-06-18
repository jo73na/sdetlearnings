package mandatoryHomeWork.week1.day3;

public class PascalTrianglePattern {

	public static void main(String[] args) {
		
		pattern8(5); 
	}

	static void pattern8(int n) {
		System.out.println("Pattern8----------------");
		for (int row = 1; row <= 2 * n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
