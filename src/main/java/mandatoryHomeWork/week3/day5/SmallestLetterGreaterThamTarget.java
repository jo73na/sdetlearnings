package mandatoryHomeWork.week3.day5;

public class SmallestLetterGreaterThamTarget {

	public static void main(String[] args) {
		char[] 	letters = {'c','f','j'}; char target = 'a';
				char[] letters1 = {'c','f','j'}; char target1 = 'c';
				char nextGreatestLetter = nextGreatestLetter(letters, target);
				System.out.println(nextGreatestLetter);

	}
		public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0 ;
		int end = letters.length-1;
		while(start <= end){
		int mid = (start + end)/2;
		if(letters[mid] > target){
		end = mid -1;
		}
		else{
		start = mid +1;
		}
		}
		return letters[start%letters.length];
		}
		

}
