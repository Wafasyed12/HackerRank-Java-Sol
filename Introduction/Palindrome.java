package practice;

public class Palindrome {

	public static void main(String[] args) {

		int num = 121;
		int ognum = num;
		int rev = 0;
		
		while(num != 0) {
			int digit= num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}if(ognum == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
