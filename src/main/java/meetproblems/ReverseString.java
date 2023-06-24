package meetproblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		int k = 2;
		String reverseStr = reverseStr(s, k);
		System.out.println(reverseStr);
	}

	public static String reverseStr(String s, int k) {
		char[] charArray = s.toCharArray();
		int left = 0;
		for (int right = k - 1; right < charArray.length; right = k * 2) {
			while (left < right) {
				swap(charArray, left, right);
				left++;
				right--;}

		}

		StringBuilder sb = new StringBuilder();
		for (char c : charArray) {
			sb.append(c);
		}

		return sb.toString();

	}

	private static void reverseblock(char[] charArray, int left, int right) {
		while (left < right) {
			swap(charArray, left, right);
			left++;
			right--;
		}

	}

	private static void swap(char[] charArray, int left, int right) {
		char temp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;

	}

}
