package Demo_oops;

import java.util.*;
import java.lang.*;

public class loop_char {
	public static void main(String[] args) {
		System.out.println("Enter any name: ");
		Scanner sc = new Scanner(System.in);
		int count =0;
		String n = sc.nextLine().toLowerCase();
		int l =n.length();
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			//counting chars in a string
			count +=1;
			System.out.println("index of char " + c + " is " + i);
		}
		System.out.println("Length of a string "+n+" is : "+l);
		System.out.println("count of chars in name "+n+" is: "+count);
	}
}
