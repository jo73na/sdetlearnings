package mandatoryHomeWork.week4.day3;

import java.util.Stack;

public class RemoveAdjecentDuplicates {

	public static void main(String[] args) {
		String s = "abbaca";
		String removeDuplicates = removeDuplicates(s);
		System.out.println(removeDuplicates);
	}

	public static String removeDuplicates(String s) {
	//	char[] charArray = s.toCharArray();
		char[] charArray = s.toCharArray();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < charArray.length; i++) {
			if (st.isEmpty()) {
			//	System.out.println("is empty: " + charArray[i]);
				st.push(charArray[i]);
				continue;
			}
			if (st.peek() == charArray[i]) {
		//		System.out.println("peek: " + charArray[i]);
				st.pop();
			} else {
			//	System.out.println(" adja != so push " + charArray[i]);
				st.push(charArray[i]);
			}

		}
		String sb = new String();
		while (!st.isEmpty()) {
			sb = st.pop()+sb;
		}

		return sb;
	}

}
