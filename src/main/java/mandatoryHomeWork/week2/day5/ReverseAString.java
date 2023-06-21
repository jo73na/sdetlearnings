package mandatoryHomeWork.week2.day5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love u";
		String str1 = "Let's take LeetCode contest";
		String[] splited = str.split(" ");
		System.out.println(Arrays.toString(splited));
		String traverseAll = traverseAll(splited);
		

		// char[] reverse = reverse("let's".toCharArray());
		System.out.println((traverseAll));
		
		String traverseAllOpt = reverseWords(str1);

		System.out.println((traverseAllOpt));

	}

	private static String traverseAll(String[] splited) {
		int left = 0;
		int right = splited.length - 1;
		while (left <= right) {
			if (left == right) {
				splited[left] = reverse(splited[left++].toCharArray());
				break;
			} else {
				splited[left] = reverse(splited[left++].toCharArray());
				splited[right] = reverse(splited[right--].toCharArray());
			}

		}

		// return splited;

		return Stream.of(splited).map(arr -> new String(arr+" ")).collect(Collectors.joining()).trim();
	}

	private static String reverse(char[] str) {

		/*
		 * if(str.length==1) { return Stream.of(str).map(arr -> new
		 * String(arr)).collect(Collectors.joining())+" "; }
		 */

		int left = 0;
		int right = str.length - 1;
		while (left <= right) {
			swap(str, left, right);
			left++;
			right--;
		}
		// String collect = Stream.of(str).map(arr -> new
		// String(arr)).collect(Collectors.joining()) + " ";
		return new String(str);

	}

	private static void swap(char[] str, int left, int right) {
		char temp = str[left];
		str[left] = str[right];
		str[right] = temp;
	}

	public static String reverseWords(String str) {
		char[] charArray = str.toCharArray();
		int start=0;
		int end=0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==' ') {
				reverse(charArray, start,end-1);
				
				start=end+1;
			}
			end++;
		}
		reverse(charArray, start,end-1);
		return new String(charArray);
		 }

		private static void reverse(char[] charArray, int left, int right) {
			while(left<right) {
				char temp=charArray[left];
				charArray[left++]=charArray[right];
				charArray[right--]=temp;
			}
			}

	
	
}
