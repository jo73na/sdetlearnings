package ownProblemsRef;

import java.util.ArrayList;
import java.util.List;

public class LeftRotae {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		rotateLeft(2, l);

	}

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		List<Integer> ll = new ArrayList<>();

		for (int i = d; i < arr.size(); i++) {

			ll.add(arr.get(i));
		}

		for (int i = 0; i < d; i++) {

			ll.add(arr.get(i));
		}
		System.out.println(ll.toString());

		return ll;

	}

}
