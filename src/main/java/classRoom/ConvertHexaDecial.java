package classRoom;

public class ConvertHexaDecial {
//
//	For positive Numbers:
//		Find the fraction
//		Say number is = 47
//		number %16 = 15 which is F
//		number = number/16 - 2 (Repeat till number is > 0)
//		output - 2F

	public static void main(String[] args) {
		// TODO Auto-generated method stub
positive();
	}
	
	public static void positive() {
//		 String decToHex = "0123456789abcdef";
//		 char[] hexArray = decToHex.toCharArray();
		 char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		    
		int num=26;
		int temp=0;
		int digit=0;
		
		 String result =new String();
		while(num>0) {
			 temp=num%16;;
				result = (hex[temp]) + result;
			num=num/16;
		
		}
		System.out.println(result);
		
		
	}

}
