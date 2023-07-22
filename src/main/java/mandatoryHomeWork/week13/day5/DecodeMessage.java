package mandatoryHomeWork.week13.day5;

import java.util.HashMap;

import org.testng.Assert;

public class DecodeMessage {

	public static void main(String[] args) {
	String	key = "eljuxhpwnyrdgtqkviszcfmabo",
			message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
	String decodeMessage = decodeMessage(key, message);
	System.out.println(decodeMessage);
	Assert.assertEquals(decodeMessage, "the five boxing wizards jump quickly");
	}
	 public static String decodeMessage(String key, String message) {
	        HashMap<Character,Character> map = new HashMap<>();
	        int a = 97;
	        // char[] keys = key.tocharArray();
	        for(int i = 0; i<key.length(); i++){
	            char ch = key.charAt(i);
	            if (ch == ' ') {
	                continue;
	            } else {
	                if (!map.containsKey(ch)) {
	                    map.put(ch, (char) a);
	                    a++;
	                }
	            }
	        }


	        StringBuilder s = new StringBuilder();
	        for(int i = 0; i<message.length(); i++){
	            if(message.charAt(i) == ' '){
	                s.append(' ');
	            }
	            else {
	                s.append(map.get(message.charAt(i)));
	            }
	        }

	        return s.toString();
	    }

}
