package mandatoryHomeWork.week9.day1;

public class SpaceHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="SeSSrSSOQ";
int marsExploration = marsExploration(s);
System.out.println(marsExploration);
	} 
	public static int marsExploration(String s) {
	    // Write your code here
	    int hlen=3;
	  if( s.length()%3!=0) {
		  return -1;
	  }
	    int good=0;
	    for(int i=0;i<s.length();){
	        String substring = s.substring(i, i+hlen);
	      //  System.out.println(substring);
	        good += isGood(substring);
	        i+=hlen;
	    }
		return good;
	    

	    }
	
	public static int isGood(String s) {
		int count=0;
	count+=	(s.charAt(0)=='S')?0:1;
	count+=	(s.charAt(1)=='O')?0:1;
	count+=	(s.charAt(2)=='S')?0:1;
	return count;
	}

}
