package day3;

import java.util.Scanner;

public class LatSwitchCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih nomor 1 - 10");
		int number = input.nextInt();
		
		switch(number) {
			case 1 : 
				System.out.println("Ini nomor 1");
				break;
			case 2 : 
				System.out.println("Ini nomor 2");
				break;
			case 3:
				System.out.println("Ini nomor 3");
				break;
			case 4:
				System.out.println("Ini nomor 4");
				break;
			case 5:
				System.out.println("Ini nomor 5");
				break;
			case 6:
				System.out.println("Ini nomor 6");
				break;
			case 7:
				System.out.println("Ini nomor 7");
				break;
			case 8:
				System.out.println("Ini nomor 8");
				break;
			case 9:
				System.out.println("Ini nomor 9");
				break;
			case 10:
				System.out.println("Ini nomor 10");
				break;
			default:
				System.out.println("Tidak ada pilihan nomor!");
				break;
		}
		input.close();
	}

}
