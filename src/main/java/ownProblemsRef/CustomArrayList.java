package ownProblemsRef;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<>();
		boolean add = ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		System.out.println(ls);
		// add at last
		Integer integer = ls.get(0);
		// ls.remove();
		ls.set(1, 6);
		System.out.println(ls);
		ls.add(2, 7);
		System.out.println(ls);
		ls.size();
		// System.out.println(ls);
		ls.isEmpty();

	}

	static int[] data;
	private static int deafultSize = 10;
	static int size = 0;

	public void CustomArrayList() {

		this.data = new int[deafultSize];

	}

	public static void add(int val) {
		if (isFull()) {
			resize();
		}
		data[size] = val;
		size++;
	}

	private static void resize() {
		int[] temp = new int[size * 2];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];

		}
		data = temp;

	}

	private static boolean isFull() {
		if (data.length == size) {
			return true;
		}
		return false;
	}

	public static int size() {
		return size;
	}

	public static boolean isEmpty() {
		return (size == 0) ? true : false;
	}
	// 123456->size6
	// size=5
	// data[5]=7
	// 12345

	public static int remove() {
		int i = data[size];
		size--;
		return i;
	}

	public static void set(int index, int val) {
		data[index] = val;
	}

}
