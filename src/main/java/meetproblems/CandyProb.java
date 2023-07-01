package meetproblems;

public class CandyProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = { 0, 5, 10, 10, 20 };
		boolean name = name(c);
		System.out.println(name);
	}

	public static boolean name(int[] c) {
		int fCount = 0;
		int tCount = 0;

		for (int i = 0; i < c.length; i++) {
			// 5
			if (c[i] == 5) {
				fCount += 1;
			} else if (c[i] == 10) {
				if (fCount >= 1) {
					tCount += 1;
					fCount -= 1;
				} else {
					return false;
				}
			} else if (c[i] == 20) {
				if (fCount >= 1 && tCount >= 1 && c[i] == 20) {
					tCount -= 1;
					fCount -= 1;
				} else if (fCount >= 3) {
					fCount -= 3;
				} else {
					return false;
				}
			} else {
				return false;
			}

		}
		return true;
	}
}
