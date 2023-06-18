package mandatoryHomeWork.week5.day5;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = {"--X","X++","X++"};
		int finalValueAfterOperations = finalValueAfterOperations(operations);
		System.out.println(finalValueAfterOperations);
	}
	 public static int finalValueAfterOperations(String[] operations) {
         int x = 0;
	        for(String s : operations)
	            x += s.charAt(1) == '+' ? 1 : -1;
	        return x;
  }

}
