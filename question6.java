package Assignment_8;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        
        int num=scan.nextInt();
        next3(num);
        
    }

    public static void next3(int num) {
    System.out.println("next 3 are:");
        for (int i = 1; i <= 3; i++) {
            num++;
            System.out.print(num + " ");
        
        }
        
        
    }

}

