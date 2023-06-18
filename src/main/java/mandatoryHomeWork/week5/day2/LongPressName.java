package mandatoryHomeWork.week5.day2;

public class LongPressName {

	public static void main(String[] args) {
String name ="jjjjoooooeeeeetthh";
boolean longPressName = isLongPressName("joeth", name);
System.out.println(longPressName);
	}

	public static boolean isLongPressName(String n, String t) {
		if (n.isEmpty() || 1 == t.length()) {
			  return false;
			}
		
		int nLen = n.length();
		int tLen = t.length();
		int i = 0;
		int j = 0;
        
        for (; j < tLen && i<nLen; ){
        	 int tCount = 0; 
        	 int nCount = 0; 
        	 char c1 = n.charAt(i);
        	 char c2 = t.charAt(j);
             if(c1 != c2) {
            	 return false;
             }
             for (;i<nLen   && n.charAt(i) == c1; ) {
            	 nCount++;
            	 i++;
			}
        	
             for (;j<tLen   && t.charAt(j) == c2;) {
            	 tCount++;
            	 j++;
			}
             
             if(tCount<nCount) {
            	 return false;
             }
             
             
        	
		}
        
        return i==nLen&&j==tLen;
		
		
	
}
}
