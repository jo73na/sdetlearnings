package mandatoryHomeWork.week6.day3;

public class SpecialPositionsmatrix {

	public static void main(String[] args) {
	int[][]	mat = {{1,0,0},{0,0,1},{1,0,0}};
	int numSpecial = numSpecial(mat);
	System.out.println(numSpecial);

	}
	 public static int numSpecial(int[][] mat) {
         int len = mat.length;
        int newLen = mat[0].length;
        int res = 0;
        int  col[] = new int[newLen], row[] = new int[len];
        for (int i = 0; i < len; i++) 
            for (int j = 0; j < newLen; j++) 
                if (mat[i][j] == 1){
                    col[j]++;
                    row[i]++;
                } 
        for (int i = 0; i < len; i++) 
            for (int j = 0; j < newLen; j++) 
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) res++;
        return res;
    }

}
