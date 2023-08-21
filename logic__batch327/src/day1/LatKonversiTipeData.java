package day1;

import java.util.Scanner;

public class LatKonversiTipeData {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("--Konversi Tipe Data --");
		double luas;
		int alas, tinggi;
		
		System.out.print("Masukkan nilai alas: ");
		alas = input.nextInt();
		
		System.out.print("Masukkan nilai tinggi: ");
		tinggi = input.nextInt();
		
//		luas = Double.parseDouble((alas * tinggi)/2.0); // parse is only used for a String argument
//		luas = Double.valueOf((alas * tinggi)/2.0);
		luas = (double) ((alas * tinggi)/2.0);
		
		System.out.println("Alas = " + alas);
		System.out.println("Tinggi = " + tinggi);
		System.out.format("Luas adalah %s ", luas);
		
		input.close();
		}

}
