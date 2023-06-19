package mandatoryHomeWork.week1.day4;

public class Pattern {

	public static void main(String[] args) {
		
		  pattern1(5); pattern2(5); pattern3(5); pattern4(5); pattern5(5); pattern6(5);
		  pattern7(5); pattern8(5); pattern9(5); pattern10(5);pattern11(5);pattern12(5);
		
	}

	

	static void pattern1(int n) {
		System.out.println("Pattern1----------------");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		System.out.println("Pattern2----------------");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		System.out.println("Pattern3----------------");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		System.out.println("Pattern4----------------");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		System.out.println("Pattern5----------------");
		for (int row = 1; row <= n; row++) {
			// int totalCol=row>n?2*n-row-1:row;

			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		System.out.println("Pattern6----------------");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		System.out.println("Pattern7----------------");
		for (int row = 1; row <= 2 * n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalCol; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		System.out.println("Pattern8----------------");
		for (int row = 1; row <= 2 * n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		System.out.println("Pattern9----------------");
		for (int row = 1; row <= n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			int totalSpace = n - totalCol;
			for (int space = 1; space <= totalSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern10(int n) {
		System.out.println("Pattern10----------------");
		for (int row = 1; row <= n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			int totalSpace = n - totalCol;
			for (int space = 1; space <= totalSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalCol; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	static void pattern11(int n) {
		System.out.println("Pattern11----------------");
		for (int row = 1; row <= 2 * n; row++) {
			int totalCol = row > n ? 2 * n - row : row;
			int totalSpace = n - totalCol;
			for (int space = 1; space <= totalSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalCol; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	 public static void pattern12(int gvn){
         //Upper triangle
           for (int i=gvn;i>0;i--){
               //spaces
               for (int spc = 0 ; spc<gvn-i;spc++){
                   System.out.print(" ");
               }
               for(int j = i ;j>0;j-- ){
                   System.out.print("* ");
               }
               if(i != 1) System.out.println();
           }

     //lower triangle
     for (int i=0;i<=gvn;i++){
         //spaces
         for (int spc = gvn-i; spc>0;spc--){
             System.out.print(" ");
         }
         for (int j= 0;j<i;j++){
             System.out.print("* ");
         }
         System.out.println();
     }



 }
	
}
