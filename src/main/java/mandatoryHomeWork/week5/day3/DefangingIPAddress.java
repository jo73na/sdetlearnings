package mandatoryHomeWork.week5.day3;

import java.util.Stack;

public class DefangingIPAddress {

	public static void main(String[] args) {
	String	address = "255.100.50.0";
	defangIPaddr(address);
	}
	public static String defangIPaddr(String address) {
     StringBuilder sb = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if(address.charAt(i)=='.') {
				sb.append("[.]");
			}else {
				sb.append(address.charAt(i));
			}
			
		}
		System.out.println(sb.toString());
		return sb.toString();
        
    }

}
