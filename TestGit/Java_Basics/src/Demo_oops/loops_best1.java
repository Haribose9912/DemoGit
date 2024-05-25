package Demo_oops;

import java.util.Scanner;

public class loops_best1 {
	public static void main(String[] args) {

		System.out.println("Enter any number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Given number "+num+" is greater than "+i);
		}
		System.out.println("Enter any number: ");
		int num2= s.nextInt();
		System.out.println("choose number for starting point: ");
		int k ;
		for(k = s.nextInt();k>num2;k--) {
			System.out.println("Given number "+num2+" is less than "+k);
		}
		
	}
}
