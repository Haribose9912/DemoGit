package Practise_Programs;

import java.util.Scanner;

public class Scanner1{
	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if (name.equals("harish")||name.equals("sharanya")){
			System.out.println("Hello Boss...");
		}else {
			System.out.println("Your name has been registed as: "+name);
		}
		System.out.println("Enter your age: ");
		int age =sc.nextInt();
		if(age<=17) {
			System.out.println("You are not eligible for registration.");
		}else if(age>=18&&age<=100) {
			System.out.println("You are eligible for registration.\nThank you..");
		}
		else {
			System.out.println("Invalid age..\nenter valid age..");
		}
	
	}
}