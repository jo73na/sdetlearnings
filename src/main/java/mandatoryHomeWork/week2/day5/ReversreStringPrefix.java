package mandatoryHomeWork.week2.day5;

public class ReversreStringPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word= "c";
		char ch = 'c';
String reversePrefix = reversePrefix(word, ch);
System.out.println(reversePrefix);
	}
    public static String reversePrefix(String word, char ch) {
		int start = 0;
        int end = word.indexOf(ch);
        char[] arr = word.toCharArray();
        while(end < word.length()) {
           if(end >= 0) 
            {
                reverse(arr, start, end);
                break;
            }
            end--;
        }
        return String.valueOf(arr);
        
		/*

 int j = 0;
        char[] arr = word.toCharArray();
        while(j < word.length()) {
            if(arr[j] == ch) {
                reverse(arr, i, j);
                break;
            }
            j++;
        }
        return String.valueOf(arr);
*/        
        
    }

    public static void reverse(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
