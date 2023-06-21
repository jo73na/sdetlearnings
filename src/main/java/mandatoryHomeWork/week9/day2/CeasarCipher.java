package mandatoryHomeWork.week9.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public class CeasarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String caesarCipher = caesarCipher(
				"1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M", 27 % 26);
		// okffng-Qwvb
		System.out.println(caesarCipher
				           .equals("1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N"));
		System.out.println(caesarCipher);
		char con = 'Z';
		int k = 2;
		//System.out.println((con + k > 90 && con <= 90) ? (char) (((con + k) % 90 + 64)) : (char) (con + k));
		/*
		 * if ((int) con > 65 || (int) con < 90) { System.out.println ((con + k > 90) ?
		 * (char) (((con + k) % 90 + 64)) : (char) (con + k)); }
		 */
	}

	public static String caesarCipher(String s, int k) {
		System.out.println('a'-96);
		int left = 0;
		int right = s.length() - 1;
		char[] arr = s.toCharArray();
		while (right >= left) {
			if (left < right) {
				arr[left] = convert1(arr[left], k);
				arr[right] = convert1(arr[right], k);
				left++;
				right--;
			} else if (left == right) {
				// System.out.println("=====");
				arr[right] = convert1(arr[right], k);
				right--;

			}
		}

		String ans = new String(arr);
		// System.out.println(s);
		// System.out.println(ans);
		return ans;
		// Write your code here

	}

	public static char convert(char con, int k) {
		char r = '\0';
		if ((int) con < 65 || (int) con > 122) {
			return con;
		}
		if ((int) con > 96 && (int) con < 123) {
			r = (con + k > 122) ? (char) (((con + k) % 122 + 96)) : (char) (con + k);
		} else

		if ((int) con > 64 && (int) con < 91) {
			r = (con + k > 90) ? (char) (((con + k) % 90 + 64)) : (char) (con + k);
		}
		// System.out.println(con+"--->"+r);
		return r;

	}
	
	static char convert1(char ch, int k) 
    {
       
        
            int num =0;
          

            if( ch >= 65 && ch <= 90 )
            {
                num = (int)ch + k;
                if(num>90) num -= 26;
                ch= (char)num;
            }
            else if( ch >= 97 && ch <= 122 )
            {
                num = (int)ch + k;
                if(num>122) num -= 26;
                ch= (char)num;
            }
        
		return ch;

    }

}
