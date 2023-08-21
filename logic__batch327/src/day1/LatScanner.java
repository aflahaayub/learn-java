package day1;

import java.util.Scanner;

//import java.util.Scanner;


public class LatScanner {

	public static void main(String[] args) {
		System.out.println("-- Data Bootcamp 327 -- ");
		
		Scanner input = new Scanner(System.in); //ctrl+shift+o to automatically importing the package
		
		System.out.println("Name : ");
		String nama = input.nextLine();
		
		System.out.println("Address : ");
		String alamat = input.nextLine();
		
		System.out.println("Age : ");
		int age = input.nextInt();
		
		System.out.println("Paycheck : ");
		int gaji = input.nextInt();
		
		System.out.println("-----------------");
		System.out.println("Hello, " + nama + "!");
		System.out.println("Your home is at " + alamat);
		System.out.println("Oh, your age is " + age);
		System.out.println(gaji + " is your total paycheck!");
		
		// Format
		System.out.format("Nama peserta : %s dan alamat: %s %n",nama, alamat);
		System.out.format("ini adalah peserta bootcamp");
		
		input.close();
		
	}

}
