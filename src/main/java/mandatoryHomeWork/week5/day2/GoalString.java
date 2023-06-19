package mandatoryHomeWork.week5.day2;

public class GoalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "G()()()()(al)";
		String interpret = interpret(c);
		System.out.println(interpret);
	}

	public static String interpret(String enc) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < enc.length(); i++) {
			char cl = enc.charAt(i);
			if (cl != '(' && cl != ')') {
				word.append(cl);
			} else if (cl == ')' && enc.charAt(i - 1) == '(') {
				word.append('o');
			}
		}
		return word.toString();
	}

}
