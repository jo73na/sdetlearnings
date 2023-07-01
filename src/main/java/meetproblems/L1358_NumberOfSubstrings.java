package meetproblems;

/*
 * s = "abcabc"
abc -> 1-> sub->constain 
count=0;
sb->""

sb.app(s.chatAt(0))

loop(i=0, j=i+1;i<s.len-3;j++;){
sb.app(s.chatAt(j));->abcabc
if(sb.len>=3 && isCheck(sb)){ //-> 3true
count++ //->1+1+1+1
}
if(j==s.len-1){
i++//->1
sb.setLength(0)//->sb=""
sb.app(i);//->sb=b
}
}


isCheck(string sc){

adbsa.contain(a) && .contain(b) && .contain(c)-> true}\
 * 
*/
public class L1358_NumberOfSubstrings {

	public static void main(String[] args) {
		String s = "abcabc";
		int numberOfSubstrings = numberOfSubstrings(s);
		System.out.println(numberOfSubstrings);
	}

	public static int numberOfSubstrings(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for (int i = 0, j = 1; i < s.length();) {
			if (i == s.length() - 1) {
				return count;
			}
			sb.append(s.charAt(j));
			if (sb.length() >= 3 && isCheck(sb.toString())) {
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

	public static boolean isCheck(String sc) {
		boolean c = sc.contains("a") && sc.contains("b") && sc.contains("c");
		return c;

	}

}
