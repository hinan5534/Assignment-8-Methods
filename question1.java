package Assignment_8;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		plus();
	
		
	}
	
		public static void plus() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNum=scan.nextInt();
		System.out.println("Enter second number:");
		int secondNum=scan.nextInt();
		int result=firstNum+secondNum;
		System.out.println("Result:"+result);
		
	}
}
