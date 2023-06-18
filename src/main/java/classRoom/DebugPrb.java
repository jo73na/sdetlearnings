package classRoom;

public class DebugPrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex1: [1,2,3,4,5], 2, 4      Output: true
//		Ex2: [1,2,3,4,5], 2, 6      Output: false
		int[] ex = { 1, 2, 3, 4, 5 };
		int x = 2, y = 7;
		boolean findNos = findNos(ex, x, y);
		System.out.println(findNos);
	}

	public static boolean findNos(int[] arr, int x, int y) {
		boolean foundY = false;
		boolean foundX = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				foundX = true;
			}
			if (arr[i] == y) {
				foundY = true;
			}
			
		}
		
		if (foundX && foundY) {
			return true;
		}

		return false;
	}

}