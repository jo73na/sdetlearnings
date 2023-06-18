package mandatoryHomeWork.week3.day5;

public class KbeautyNum {
			// Integer.parseInt --> change any string or any other datatype into int.
			// String.substring(start,end) --> will give string part from main string 
			// in range of start to end.
	public static void main(String[] args) {
	int	num = 430043; int k = 3;
	int divideSlidWindow = divideSlidWindow(num, k);
	System.out.println(divideSlidWindow);
	}
	
	public static int divideSlidWindow(int num, int k) {
	    String s = String.valueOf(num);//=sb
	    int count = 0;
	    for(int i = 0; i <= s.length()-k; i++){
		
	        int number = Integer.parseInt(s.substring(i,i+k));
	        if(number > 0 && num%number==0){
	            count++;
	        }
	    }
	        return count;
	    }

}
