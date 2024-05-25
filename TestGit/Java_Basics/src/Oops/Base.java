package Oops;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n =5;
		String s = "hello";
		for(int i=0;i<n;i++) {
			if(s=="hell") {
				System.out.println("Fail");
			}else {
				System.out.println("Pass: "+s);
				
			}
		}
	}
}
