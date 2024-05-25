package Practise_Programs;

public class SingleChar{
	public static void main(String[] args) {
		// this program to print a specific character from a string


        String s1 = "hariesh";
        char lastChar = '\0'; // Initialize to null character
        
        // Loop through each character of the string
        for (int i = 0; i < s1.length(); i++) {
            // Update lastChar in each iteration
        	if(i==4) {
            lastChar = s1.charAt(i);
        }
       }
        // Printing the last character
        System.out.println("Output: " + lastChar);
	}
}