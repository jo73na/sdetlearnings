package mandatoryHomeWork.week1.day2;

public class AddAllDigits {
	public static void main(String[] args) {
		int add = add(157);
		System.out.println(add);
	}
	static int add(int num) {
		while (num >= 10) {
			num = digitAdd(num);
		}
		return num;
	}
	public static int digitAdd(int temp) {
		int sum = 0;
		while (temp > 0) {
			//157%10->150->7->sum=0+7->7
			//15%10->5->1
			sum += temp % 10;
			//157/10->15->temp=15
			temp = temp / 10;
		}
		return sum;
	}

}
