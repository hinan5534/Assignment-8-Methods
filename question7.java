package Assignment_8;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.println(isPalindrome(number));
		

	}

	private static boolean isPalindrome(int num) {
		boolean flag = false;

		int reverse = 0;
		int realNum = num;

		while (num > 0) {
			reverse = (reverse * 10) + num % 10;
			num /= 10;
	
		}

		if (reverse == realNum) {
			flag = true;
		}

		return flag;

	}

}