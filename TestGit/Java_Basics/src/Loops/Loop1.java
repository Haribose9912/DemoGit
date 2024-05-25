package Loops;

import java.util.Scanner;

public class Loop1 {
public static void main(String[] args) {
	System.out.println("Please enter your name: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next().toLowerCase();
	for(int i=0;i<name.length();i++) {
		char c = name.charAt(i);
		System.out.println(c);
	}
}
}
