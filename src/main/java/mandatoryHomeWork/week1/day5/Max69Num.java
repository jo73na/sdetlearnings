package mandatoryHomeWork.week1.day5;

public class Max69Num {

	public static void main(String[] args) {
		// TODO Auto-generated method 
int num=9666;
int len=len(num);
int dig=len-1;
int[] digit= new int[len];//[9,6,6,6]
while(num>0) {
	digit[dig--]=num%10;
	num=num/10;
}

int updateNumDigit = updateNumDigit(digit);
System.out.println(updateNumDigit);


	}
	
	public static int len(int number) {
		int length = 0;
		long temp = 1;
		while (temp <= number) {
		    length++;
		    temp *= 10;
		}
		return length;
	}
	public static int updateNumDigit(int[] digit) {
		int updateNum=0;
		boolean sixSeen=false;
		for (int i = 0; i < digit.length; i++) {
			if(!sixSeen && digit[i]==6) {
				sixSeen=true;
				digit[i]=9;
				
			}
			updateNum=updateNum*10+digit[i];//9, when i=0
		}																		//99 when i=1
		return updateNum;									//996 when i=2
	}																			//9966 when i=3

}
