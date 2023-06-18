package mandatoryHomeWork.week4.day2;

import java.util.Stack;

public class BaseBallGameStack {

	public static void main(String[] args) {
		String[] ops = { "5", "2", "C", "D", "+" };
		String[] ops1 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		int calPoints = calPoints(ops1);
		System.out.println(calPoints);
	}

	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("C"))
				stack.pop();
			else if (ops[i].equals("D"))
				stack.push(2 * Integer.valueOf(stack.peek()));
			else if (ops[i].equals("+")) {
				int k = stack.peek();
				stack.pop();
				int j = stack.peek();
				stack.push(k);
				stack.push(k + j);
			} else
				stack.push(Integer.valueOf(ops[i]));
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}
}
