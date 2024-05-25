package Demo_oops;
import java.util.*;
public class demo1 {
	    public static void main(String[] args) {
	      System.out.println("Enter any name: ");
	      Scanner sc = new Scanner(System.in);
	      String n = sc.nextLine();
	      for(int i=0;i<n.length();i++){
	        char c =n.charAt(i);
	        System.out.println("Index of Character "+c+" is "+i);
	     }
	 }
}