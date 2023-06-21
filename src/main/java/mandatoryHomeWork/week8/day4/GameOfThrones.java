package mandatoryHomeWork.week8.day4;

import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="cdcdcdcdeeeef";
		String gameOfThrones = gameOfThrones(s);
		System.out.println(gameOfThrones);

	}
	 public static String gameOfThrones(String s) {
		    // Write your code here
		    Map<Character,Integer> hm=new HashMap<>();
		    int count=0;
		    for(int i=0;i<s.length();i++){
		        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
		    }
		    
		    for (char c : hm.keySet()) {
		    	System.out.println(hm.get(c));
		        if(hm.get(c)%2!=0){
		            count++;
		        }
		    }
		    System.out.println("Count: "+count);
		    if(s.length()%2==0&&count==0){
		        return "YES";
		    }else if(s.length()%2!=0&&count==1){
		         return "YES";
		    }else{
		        return "NO";
		    }

		    }

}
