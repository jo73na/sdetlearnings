package ownProblemsRef;

import java.util.Arrays;

public class RingsAndRods {

	 public static void main(String[] args) {
	      String rings = "B0R1G0R9R1B0G0";
	     int c= countPoints(rings);
	     System.out.println(c);
	   }
	   public static int countPoints(String rings) {
	        String[] rods = new String[10];
	        Arrays.fill(rods, "");
	        for (int i = 0; i < rings.length() - 1; i += 2) {
	            int index = rings.charAt(i + 1) - '0';
	            char charAtIndex = rings.charAt(i);
	        //    int indexOf = rods[index].indexOf(charAtIndex);
	            if (rods[index].indexOf(charAtIndex) == -1) {
	           // 	String format = String.format("%s%c", rods[index], charAtIndex);
	                rods[index] = String.format("%s%c", rods[index], charAtIndex);
	            }
	        }

	        int rodsCount = 0;
	        for (String rod : rods) {
	            if (rod.length() == 3) {
	                rodsCount++;
	            }
	        }

	        return rodsCount;
	    }

}


