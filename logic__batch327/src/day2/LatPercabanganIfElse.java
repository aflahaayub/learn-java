package day2;

import java.util.Scanner;

public class LatPercabanganIfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("MASUKKAN NAMA : ");
		String karyawan = input.next();
//		String karyawan = input.nextLine();
		
		System.out.print("MASUKKAN NOMOR: ");
		int number = input.nextInt();
		
		System.out.println("Apakah you karyawan? ");
		String answer = input.next();
		
		System.out.println("Selamat Pagi!");
		System.out.println("Selamat Datang!");
		
//		if(answer == "Ya") {
		if(answer.toLowerCase().equals("ya")) {  // THE SAFEST WAY IS TO USE EQUALS METHOD
			System.out.println("Sampai Jumpa");
		}else {
			System.out.println("Ga jadi keluar");
		}
		
		System.out.println("Hati hati di jalan");
		
//		System.out.println(answer);
//		System.out.println(number);
//		System.out.println(karyawan);
		
		
	}

}
