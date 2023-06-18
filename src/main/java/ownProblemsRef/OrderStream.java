package ownProblemsRef;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class ArithematicTriplet {
	public static void main(String[] args) {
		
	}

	public int insert( int[] value, int diff) {
    	HashSet<Integer> hs=new HashSet<>();
    	int count=0;
    	for (int i = 0; i < value.length; i++) {
			if(hs.contains(value[i]-diff)&&hs.contains(value[i]-2*diff)) {
				count++;
			}
			hs.add(value[i]);
			
		}
       
       return count;
    }
}