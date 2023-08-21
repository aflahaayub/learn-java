package day2;
import java.util.Scanner;

public class LatPercabanganIFELSEV2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nama anda: ");
		String nama = input.next();
		
		System.out.print("Masukkan umur anda: ");
		int umur = input.nextInt();
		
		System.out.printf("Nama anda: %s %n", nama);
		System.out.println("Umur anda: " + umur);
		
		if(umur >= 18) {
			System.out.println("Boleh masuk bioskop!");
		}else {
			System.out.println("Tidak boleh masuk bioskop!");
		}
		
		input.close();

	}

}
