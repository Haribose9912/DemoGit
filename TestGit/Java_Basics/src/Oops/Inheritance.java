package Oops;
import java.util.ArrayList;

public class Inheritance {
    public static void main(String[] args) {
        String s = "Hariesh";
        String s1 = "Sharanya";
        ArrayList<Character> n = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s.contains(String.valueOf(c))) {
                n.add(c);
            } else {
                System.out.println("Not Available: " + c);
            }
        }
        System.out.println("Found: " + n);
    }
}
