package day1;

public class LatOperator {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println(a);
		System.out.println(b);
		
		//how to swap a and b
		a = a * b;
		b = a / b;
		a /= b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
