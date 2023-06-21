package ownProblemsRef;

import java.util.ArrayList;
import java.util.List;

public class CircularInPace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<Integer> circularArrayRotation2(List<Integer> a, int k, List<Integer> queries) {
        int arrLen=a.size();
        k=k%arrLen;
        List<Integer> out1= new ArrayList<Integer>();
        List<Integer> out2= new ArrayList<Integer>();
        for(int i=arrLen-k;i<arrLen;i++){
            out1.add(a.get(i));
        }
        for(int i=0;i<arrLen-k;i++){
            out1.add(a.get(i));
        }
        for(int i=0;i<queries.size();i++){
           out2.add(out1.get(queries.get(i))) ;
        }
        return out2;
    }

}
