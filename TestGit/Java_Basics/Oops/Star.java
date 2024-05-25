package Oops;

import java.util.ArrayList;

public class Star{
	public static void main(String[] args) {
		String s = "Hariesh";
		String s1="haranya";
		ArrayList<Character> n = new ArrayList<>();
		for(int i=0;i<s1.length();i++) {
			if(s.contains(String.valueOf(s1.charAt(i)))) {
				n.add(s1.charAt(i));
		}else {
			System.out.println("Not Avaialble: "+s1.charAt(i));
				
		}
	}
		System.out.println("Found: "+n);
}
}
// if you want to remove duplicates use set like this Set<Character> n = new HashSet<>();

//if you want to consider case less -->chars if(s.contains(String.valueOf(c)) || s.contains(String.valueOf(Character.toLowerCase(c))))