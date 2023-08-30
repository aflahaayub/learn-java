package day7;

import java.util.Scanner;

public class LatMethod {
	//variable global
	String nama = "";
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Variable lokal
		String name = "";
		int nomor = 0;
		
		// panggil method non static
		LatMethod data = new LatMethod();
		data.cetakData();
		
		// panggil method static
		cetakStatic();
		
		// panggil method with parameter
		System.out.println("Luas Persegi : " + nyobaLuas(4.25728));
		
		// called method with more than one param
		System.out.println("Luas Persegi Panjang : " + luasLongSquare(5,7));
	}
	
	// fungsi non-static
	void cetakData() {
		System.out.println("Cetak data fungsi NON static");
	}
	
	// fungsi static
	static void cetakStatic() {
		System.out.println("Cetak data fungsi static.");
	}
	
	// method with parameter
	static int nyobaLuas(double data) {
		return (int) (data*data);
	}
	
	// overloading
	static int nyobaLuas(int data) {
		return data*data;
	}
	
	// method with more than one param
	static int luasLongSquare(int p, int l) {
		return p*l;
	}

}
