package day2;

import java.util.Scanner;

public class Tugas1 {

	public static void main(String[] args) {
//		Soal01();
//		Soal02();
//		Soal03();
//		Soal04();
//		Soal05();
//		Soal06();
		Soal07();

	}
	
	static void Soal01(){
		// diskon 40% maks 30k
		// kode promo JKTOVO min belanja 30k
		// ongkos kirim per 5 km adalah 5k
		// lebih dari 5km maka ongkir +1000 per km
		// jika kurang dari 30k maka tidak ada diskon
		
		// input-> Belanja: 3000, Jarak: 6, Masukkan Promo = JKTOVO
		// output -> Belanja, Diskon 40% dari belanja, ongkir , total
		
		Scanner input = new Scanner(System.in);
		int ongkir = 5000;
			
		System.out.print("Belanja: ");
		int belanja = input.nextInt();
		double diskon = 0;
		
		System.out.print("Jarak: ");
		int jarak = input.nextInt();
		
		System.out.print("Masukan Promo = ");
		String promoCode = input.next();
		
		if(belanja >= 30000 && promoCode.equals("JKTOVO")) {
			diskon = (double) belanja * 0.4;
			if(diskon > 30000) {
				diskon = 30000;
			}
		}else {
			diskon = 0;
		}
			
		if(jarak > 5) {
			ongkir += 1000; 
		}
		
		int totalBelanja = ongkir + (belanja - (int) diskon);
		
		System.out.println("Belanja: " + belanja);
		System.out.println("Diskon 40%: " + (int) diskon);
		System.out.println("Ongkir: " + ongkir);
		System.out.println("Total Belanja: " + totalBelanja);	
		
		input.close();
	}

	static void Soal02() {
		// min order 30k, free ongkir 5k dan diskon 5k
		// min order 50k, free ongkir 10k dan dskon 10k
		// min order 100k, free ongkir 10k dan diskon 20k
		
		//input: Belanja: 35000 , Ongkos Kirim: 10000
		//output: Belanja, Ongkos Kirim, Diskon Ongkir, Diskon Belanja, Total Belanja
		
		Scanner input = new Scanner(System.in);
		System.out.print("Belanja: ");
		int belanja = input.nextInt();
		
		System.out.print("Ongkos Kirim: ");
		int ongkir = input.nextInt();
		
		int diskonBelanja = 0;
		int diskonOngkir = 0;
		
		if(ongkir > 0) {
			
			if(belanja >= 100000) {
				diskonOngkir = 10000;
				diskonBelanja = 20000;
				
			}else if(belanja >= 50000) {
				diskonOngkir = 10000;
				diskonBelanja = 10000;
				
			}else if(belanja >= 30000) {
				diskonOngkir = 5000;
				diskonBelanja = 5000;
			}
		}else {
			System.out.println("Isi harga ongkir dengan benar!")
		}
		
		
		int total = (ongkir - diskonOngkir) + (belanja - diskonBelanja);
		
		System.out.println("Belanja: " + belanja);
		System.out.println("Ongkos Kirim: " + ongkir);
		System.out.println("Diskon Ongkir: " + diskonOngkir);
		System.out.println("Diskon Belanja " + diskonBelanja);
		System.out.println("Total Belanja: " + total);
		
		input.close();
	}
	
	static void Soal03() {
		// < 10000 dapat 0 poin
		// > 30000 dapat 2 point tiap kelipatan 1000
		// 10001 - 30000 dapat 1 point tiap kelipatan 1000
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Beli Pulsa= ");
		int beliPulsa = input.nextInt();
		int point = 0;
		
		if(beliPulsa > 30000) {
			beliPulsa -= 10000; //0 poin
			beliPulsa -= 20000; // 20 poin
			point += 20;
			point += (2 * (beliPulsa/1000));		
		}else if(beliPulsa > 10000) {
			point = beliPulsa/1000;
		}
		
		System.out.println(beliPulsa);
		
		System.out.println(point + " Point");
		
		input.close();
	}

	static void Soal04() {
		Scanner input = new Scanner(System.in);
		System.out.print("Beli Pulsa: " );
		int beli = input.nextInt();
		int point = 0;
		
		if(beli >= 100000) {
			point = 800;
		}else if(beli >= 50000) {
			point = 400;
		}else if(beli >= 25000) {
			point = 200;
		}else if(beli >= 10000 && beli < 25000) {
			point = 80;
		}
		
		System.out.println("Pulsa : " + beli );
		System.out.println("Point : " + point);
		input.close();
	}

	static void Soal05() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jari-jari: ");
		int r = input.nextInt();
		
		if(r > 0) {
			double luas = Math.PI * r * r;
			double keliling = 2 * Math.PI * r;
			
			System.out.println("Luas = "+ (int) Math.ceil(luas) + " cm2");
			System.out.print("Keliling = "+ (int) Math.ceil(keliling) + " cm");			
		}else {
			System.out.println("Masukkan nilai jari-jari yang benar!");
		}
		input.close();
		
	}

	static void Soal06() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sisi: ");
		int sisi = input.nextInt();
	
		if(sisi > 0) {
			int luas = sisi*sisi;
			int kel = 4*sisi;
			
			System.out.println("Luas = " + luas);
			System.out.print("Keliling = " + kel);
		}else {
			System.out.println("Masukkan nilai sisi yang benar!");
		}
		input.close();
	}

	static void Soal07() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Angka: ");
		int angka = input.nextInt();
		
		System.out.print("Pembagi: ");
		int pembagi = input.nextInt();
		
		if(angka % pembagi == 0) {
			System.out.printf("Angka %d %% %d adalah 0", angka, pembagi);
		}else {
			System.out.printf("Angka %d %% %d bukan 0 melainkan %d", angka, pembagi, angka % pembagi);
		}
		
		input.close();
	}
}
