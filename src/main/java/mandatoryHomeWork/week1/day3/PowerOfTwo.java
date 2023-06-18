package mandatoryHomeWork.week1.day3;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean powerOfTwo = isPowerOfTwo(3);
		System.out.println(powerOfTwo);
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}

}
