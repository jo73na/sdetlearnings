package mandatoryHomeWork.week1.day5;

public class NoOfMatches {

	public static void main(String[] args) {
		numberOfMatches(5);
	}

	public static int numberOfMatches(int n) {
		int sum = 0;
		while (n > 1) {
			int rem = n / 2;
			sum += rem;
			n = n - rem;
		}
		System.out.println(sum);
		return sum;
	}

}
