package Oops;

public class num{
	public static void main(String[] args) {
		int n=10;
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			if(i==5) {
				System.out.println("Loop stopped");
				break;
			}
		}
	}
}