package Assignment_8;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = scan.nextInt();
		fib(count);
	}

	private static void fib(int count) {
		int a = 0;
		int b = 1;
		System.out.println("fibonacci series of " + count);

		for (int i = 0; i < count; i++) {
			int sum = a + b;
			System.out.print(a + " ");

			a = b;
			b = sum;
		}

	}

}
