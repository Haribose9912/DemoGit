package Practise_Programs;

public class Revstr{
	public static void main(String[] args) {
		String s ="harish";
		String revs ="";
		for(int i=s.length()-1;i>=0;i--) {
			revs = revs+s.charAt(i);
		}System.out.println("This is reversed string : "+revs);
		
	}
}
