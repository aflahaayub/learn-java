package day2;

import java.util.Scanner; // ctrl shift o

public class LatPercabanganIfElseIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama anda: ");
		String name = input.next();
		
		System.out.print("Masukkan Nilai anda : ");
		int nilai = input.nextInt();
		
		String grade = "";
		if(nilai >= 85) {
			grade = "A";
		}else if(nilai >= 65) {
			grade = "B";
		}else if(nilai >= 50) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		
		if(nilai <= 0 || nilai > 100) {
			System.out.println("Masukkan nilai yang benar!");
		}
		else if(nilai >= 65) {
			System.out.println(name + ", Anda lulus dengan grade: " + grade);
		}else {
			System.out.println(name + ", Anda tidak lulus dengan grade: " + grade);
		}
		
		input.close();

	}

}
