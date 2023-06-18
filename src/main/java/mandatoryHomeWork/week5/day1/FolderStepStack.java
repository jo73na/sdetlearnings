package mandatoryHomeWork.week5.day1;

import java.util.Stack;

public class FolderStepStack {

	public static void main(String[] args) {
		String[] logs1 = { "d1/", "d2/", "../", "d21/", "./" };
		String[] logs2 = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		String[] logs3 = { "d1/", "../", "../", "../" };
		String[] logs4 = { "./", "../", "./" };

//		int folderStack = folderStack(logs1);
//
//		int folderStack2 = folderStack(logs2);
//
//		int folderStack3 = folderStack(logs3);
		int folderStack4 = folderStack(logs4);
//		System.out.println(folderStack);
//		System.out.println("------------");
//		System.out.println(folderStack2);
//		System.out.println("------------");
//		System.out.println(folderStack3);
//		System.out.println("------------");
		System.out.println(folderStack4);
	}

	public static int folderStack(String[] s) {
		if (s.length <= 0) {
			return 0;
		}

		int len = s.length;
		int count = 0;
		Stack<String> st = new Stack<>();
		for (int i = 0; i < s.length; i++) {

			if (s[i].equals("../")) {
				if (!st.isEmpty()) {
					st.pop();
					count--;
				}
				System.out.println("pop: " + s[i] + " : " + count);
			} else if (s[i].equals("./")) {
				continue;
			} else {
				st.push(s[i]);
				count++;
				System.out.println("push: " + s[i] + " : " + count);
			}

		}
		// System.out.println(st.toString());

		return st.size();
	}

}
