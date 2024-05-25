package Oops;
//each character of the string m and checks if that character is found in the string s.
//If found, it adds the character to the list k. 
//Otherwise, it prints a "Not found" message.
import java.util.ArrayList;
import java.util.List;

public class Base2 {
	
	public void test() {
    	System.out.println("calling test method");
    }
	public static void main(String[] args) {
	
		String s= "jack"; 
		String m = "mark";
		List<Character> k = new ArrayList<>(); //Initializing array list
		List<Character> k1 = new ArrayList<>();
		//checking for s string chars in m string
		for(char i :s.toCharArray()) {
			if(m.indexOf(i)>=0) {
				
				k.add(i);
//				System.out.println("Found: "+k);
			}
			else {
				k1.add(i);
			}
		}
		System.out.println("Not found char: "+k1);
		System.out.println("Found chars: "+k);
	
		StringBuilder stringBuilder = new StringBuilder();
        for (Character character : k) {
            stringBuilder.append(character);
        }
        String result = stringBuilder.toString();
        System.out.println("Result: " + result);
        
	}
}
