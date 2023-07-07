package meetproblems;

public class SubString {

	public static void main(String[] args) {
		String s = "abcd";
		int numberOfSubstrings = numberOfSubstrings(s);
		System.out.println(numberOfSubstrings);

	}
	
	public static int numberOfSubstrings(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for (int i = 0, j = 1; i < s.length();) {
			if (i == s.length() - 1) {//
				return count;
			}
			sb.append(s.charAt(j));
			if ( true) {
				System.out.println(sb.toString()+", ");
				count++;
			}
			if (j == s.length() - 1) {
				i++;
				sb.setLength(0);//->
				sb.append(s.charAt(i));
				j = (i == s.length() - 1) ? i : i + 1;
				if (j == i || i == s.length() - 1)
					return count;
			} else {
				j++;
			}
		}

		return count;

	}

}
